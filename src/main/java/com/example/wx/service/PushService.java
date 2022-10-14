package com.example.wx.service;

import com.example.wx.constant.WXConfig;
import com.example.wx.service.response.WxAccessTokenResponse;
import com.example.wx.service.response.WxResponese;
import com.example.wx.service.support.SimpleCache;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xgh 2022/10/13
 */
@Service
@Slf4j
public class PushService {
    public static final String WX_PUSH_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=";
    public static final String WX_ACCESS_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid={appid}&secret={secret}";

    @Autowired
    ObjectMapper mapper;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    InfoService infoService;
    @Autowired
    WordService wordService;
    @Autowired
    WeatherService weatherService;

    @Autowired
    WXConfig wxConfig;

    private SimpleCache cache = new SimpleCache();

    @Scheduled(cron = "0 30 07 ? * *")
    public void send() {
        try {
            send(wordService.getWordInfo(), weatherService.getWeatherInfo(), infoService.getBasicInfo());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


    /**
     * 发送请求
     *
     * @param params
     * @throws JsonProcessingException
     */
    public void send(Object... params) throws JsonProcessingException {
        String accessToken = getAccessToken(wxConfig.getAppId(), wxConfig.getAppSecret());
        String[] parseArgs = parseArgs(params);
        sendRequest(accessToken, parseArgs);
    }

    private String getAccessToken(String appid, String secret) {
        if (cache != null && cache.expired()) {
            return cache.accessToken;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("appid", appid);
        map.put("secret", secret);
        WxAccessTokenResponse response = restTemplate.getForObject(WX_ACCESS_URL, WxAccessTokenResponse.class, map);
        String accessToken = response.getAccess_token();
        cache.setAccessToken(accessToken);
        cache.setTimeStamp(response.getExpires_in() * 1000 + System.currentTimeMillis() - 10 * 60 * 1000);
        return accessToken;
    }

    private String[] parseArgs(Object... objects) throws JsonProcessingException {
        String[] strings = new String[objects.length];
        for (int i = 0; i < objects.length; i++) {
            strings[i] = mapper.writeValueAsString(objects[i]);
        }
        return strings;
    }

    public void sendRequest(String accessToken, String... param) throws JsonProcessingException {
        HashMap<String, Object> data = merge(param);
        for (String toUser : wxConfig.openidList) {
            HashMap<String, Object> requestBody = new HashMap<>();
            requestBody.put("touser", toUser);
            requestBody.put("template_id", wxConfig.getTemplateId());
            requestBody.put("data", data);
            HttpEntity<HashMap<String, Object>> httpEntity = new HttpEntity<>(
                    requestBody, null);
            final String url = WX_PUSH_URL + accessToken;
            ResponseEntity<WxResponese> responseEntity = restTemplate.postForEntity(url, httpEntity, WxResponese.class);
            if (responseEntity.getStatusCode() != HttpStatus.OK) {
                log.error("请求失败");
            } else {
                WxResponese body = responseEntity.getBody();
                if (body.getErrcode() != 0) {
                    log.error(body.getErrmsg());
                }
            }
        }
    }

    private HashMap<String, Object> merge(String... params) throws JsonProcessingException {
        HashMap<String, Object> map = new HashMap<>();
        for (String param : params) {
            Map<String, Object> value = mapper.readValue(param, new TypeReference<Map<String, Object>>() {
            });
            map.putAll(value);
        }
        return map;
    }

}
