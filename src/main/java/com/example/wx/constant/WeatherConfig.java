package com.example.wx.constant;

import com.example.wx.constant.entity.WeatherInfo;
import com.example.wx.constant.entity.WeatherResp;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author xgh
 */
@Component
@Data
@ConfigurationProperties(prefix = "weather.config")
@NoArgsConstructor
@AllArgsConstructor
public class WeatherConfig {
    public String city;
    /**
     * 高德api
     *     url: "https://restapi.amap.com/v3/weather/weatherInfo?city=350100&key=cacbc4353339a89c7bd8f7403b313d49"
     *     key: "your key"
     *     areaCode: "350101"
     */

    /**
     * 中央气象台
     * http://www.nmc.cn/rest/weather?stationid=58847
     * stationid 查询接口  ${FJ} 省份首字母大写
     * http://www.nmc.cn/rest/province/A${FJ}
     *
     * @return
     */


    public static WeatherInfo getWeather(WeatherConfig config) throws JsonProcessingException {
        final RestTemplate template = new RestTemplate();
        final ResponseEntity<WeatherResp> entity = template.getForEntity("http://www.nmc.cn/rest/weather?stationid=" + config.getCity(), WeatherResp.class);
        if (entity.getStatusCode() == HttpStatus.OK) {
            final WeatherResp resp = entity.getBody();
            if (resp.getCode() == 0) {
                return resp.getData();
            }
        }
        throw new IllegalStateException("获取天气失败");
    }
}
