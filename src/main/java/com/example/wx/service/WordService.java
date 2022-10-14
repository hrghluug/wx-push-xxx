package com.example.wx.service;

import com.example.wx.service.entity.BasicInfo;
import com.example.wx.service.entity.WordInfo;

/**
 * @author xgh 2022/10/13
 */
public interface WordService {
    /**
     * 每日一句
     *
     * @return
     */
    WordInfo getWordInfo();
}