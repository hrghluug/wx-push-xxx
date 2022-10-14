package com.example.wx.constant.entity;

import lombok.Data;

/**
 * 中央气象台响应
 *
 * @author xgh 2022/10/11
 */
@Data
public class WeatherResp {
    private Integer code;
    private String msg;
    private WeatherInfo data;
}
