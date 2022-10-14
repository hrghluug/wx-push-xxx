package com.example.wx.service;

import com.example.wx.service.entity.BasicInfo;
import com.example.wx.service.entity.WeatherRealInfo;
import com.example.wx.service.entity.WordInfo;
import org.springframework.lang.Nullable;

/**
 * @author xgh 2022/10/13
 */
public interface InfoService {
    /**
     * 获取基本信息
     * @return
     */
    BasicInfo getBasicInfo();
}
