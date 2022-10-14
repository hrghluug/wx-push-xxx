package com.example.wx.constant.entity;

import lombok.Data;

import java.util.Date;

/**
 *
 * @author xgh 2022/10/11
 */
@Data
public class PassedChartInfo {
    private int rain1h;

    private int rain24h;

    private int rain12h;

    private int rain6h;

    private double temperature;

    private String tempDiff;

    private int humidity;

    private int pressure;

    private int windDirection;

    private double windSpeed;

    private String time;
}
