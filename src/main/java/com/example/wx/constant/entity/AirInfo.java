package com.example.wx.constant.entity;

import lombok.Data;

import java.util.Date;

/**
 * 空气信息
 *
 * @authorxgh 2022/10/11
 */
@Data
public class AirInfo {
    private Integer aq;
    private Integer aqi;
    private String aqiCode;
    /**
     * 预测时间
     */
    private String forecasttime;
    /**
     * 空气质量文本
     */
    private String text;

}
