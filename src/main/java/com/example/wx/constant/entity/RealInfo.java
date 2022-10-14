package com.example.wx.constant.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author xgh 2022/10/11
 */
@Data
public class RealInfo {
    private Station station;

    private String publish_time;

    private Weather weather;

    private Wind wind;

    private Warn warn;

    @Data
    public static class Station {
        private String code;

        private String province;

        private String city;

        private String url;
    }

    @Data
    public static class Weather {
        private double temperature;

        private double temperatureDiff;

        private int airpressure;

        private int humidity;

        private int rain;

        private int rcomfort;

        private int icomfort;

        private String info;

        private String img;

        private double feelst;
    }


    @Data
    public static class Wind {
        private String direct;

        private int degree;

        private String power;

        private double speed;
    }

    @Data
    public static class Warn {
        private String alert;

        private String pic;

        private String province;

        private String city;

        private String url;

        private String issuecontent;

        private String fmeans;

        private String signaltype;

        private String signallevel;

        private String pic2;

    }
}
