package com.example.wx.service.entity;

import com.example.wx.config.WxJsonSerializer;
import com.example.wx.config.annotation.Color;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * 真正需要的天气信息
 *
 * @author xgh 2022/10/11
 */
@Color("#abcdef")
@Data
public class WeatherRealInfo {
    /**
     * 地区
     */
    @JsonSerialize(using = WxJsonSerializer.class)
    private String city;
    /**
     * 日期
     */
    @JsonSerialize(using = WxJsonSerializer.class)
    private String date;
    /**
     * 天气情况
     */
    @JsonSerialize(using = WxJsonSerializer.class)
    private String info;
    /**
     * 当前温度
     */
    @JsonSerialize(using = WxJsonSerializer.class)
    private double curTemp;
    /**
     * 最低温度
     */
    @JsonSerialize(using = WxJsonSerializer.class)
    private double minTemp;
    /**
     * 最高温度
     */
    @JsonSerialize(using = WxJsonSerializer.class)
    private double maxTemp;
    /**
     * 风力
     */
    @JsonSerialize(using = WxJsonSerializer.class)
    private String windPower;
    /**
     * 风向
     */
    @Color("#003cff")
    @JsonSerialize(using = WxJsonSerializer.class)
    private String windDirection;
    /**
     * 湿度
     */
    @JsonSerialize(using = WxJsonSerializer.class)
    private double humidity;

    /**
     * 明后天预报
     */
    @JsonSerialize(using = WxJsonSerializer.class)
    private String forecast;
}
