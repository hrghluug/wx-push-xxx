package com.example.wx.service.entity;

import com.example.wx.config.WxJsonSerializer;
import com.example.wx.config.annotation.Color;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * @author xgh 2022/10/13
 */
@Data
@Color("#ffea00")
public class WordInfo {
    @JsonSerialize(using = WxJsonSerializer.class)
    private String proverb_En;
    @JsonSerialize(using = WxJsonSerializer.class)
    private String proverb_Zh;
    @JsonSerialize(using = WxJsonSerializer.class)
    private String message;
}
