package com.example.wx.constant.entity;

import lombok.Data;

import java.util.List;

/**
 * 气候信息
 *
 * @author xgh 2022/10/11
 */
@Data
public class ClimateInfo {
    private List<MonthInfo> month;
    private String time;

    @Data
    public static class MonthInfo {
        /**
         * 最大温度
         */
        private Double maxTemp;
        /**
         * 最小温度
         */
        private Double minTemp;
        /**
         * 月份
         */
        private Integer month;
        /**
         * 降水量
         */
        private Double precipitation;
    }
}
