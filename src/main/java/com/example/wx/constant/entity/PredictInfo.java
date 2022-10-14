package com.example.wx.constant.entity;

import lombok.Data;

import javax.xml.soap.Detail;
import java.time.Month;
import java.util.Date;
import java.util.List;

/**
 * 预测信息
 *
 * @author xgh 2022/10/11
 */
@Data
public class PredictInfo {

    private RealInfo.Station station;

    private String publish_time;

    private List<Detail> detail;

    @Data
    public static class Detail {
        private String date;

        private String pt;

        private Day day;

        private Night night;
    }

    @Data
    public static class Day {
        private Weather weather;

        private Wind wind;

    }


    @Data
    public static class Weather {
        private String info;

        private String img;

        private String temperature;
    }

    @Data
    public static class Wind {
        private String direct;

        private String power;

    }


    @Data
    public static class Night {
        private Weather weather;

        private Wind wind;
    }

}


























