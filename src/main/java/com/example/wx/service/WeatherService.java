package com.example.wx.service;

import com.example.wx.service.entity.WeatherRealInfo;
import org.springframework.lang.Nullable;

/**
 * 天气
 *
 * @author xgh 2022/10/11
 */
public interface WeatherService {
    /**
     * 获取天气信息
     *
     * @return
     */
    @Nullable
    WeatherRealInfo getWeatherInfo();
}
