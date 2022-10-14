package com.example.wx.constant.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author xgh 2022/10/11
 */
@Data
public class TempChartInfo {

    private String time;

    private double max_temp;

    private double min_temp;

    private String day_img;

    private String day_text;

    private String night_img;

    private String night_text;
}
