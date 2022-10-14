package com.example.wx.service.entity;

import com.example.wx.config.WxJsonSerializer;
import com.example.wx.config.annotation.Color;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * @author xgh 2022/10/13
 */
@Data
public class BasicInfo {
    @Color("#d6290b")
    @JsonSerialize(using = WxJsonSerializer.class)
    private String maleName;
    @Color("#d6290b")
    @JsonSerialize(using = WxJsonSerializer.class)
    private String femaleName;
    @Color("#ff0000")
    @JsonSerialize(using = WxJsonSerializer.class)
    private int togetherDays;
    @Color("#9d4762")
    @JsonSerialize(using = WxJsonSerializer.class)
    private int femaleBirth;
    @Color("#9d4762")
    @JsonSerialize(using = WxJsonSerializer.class)
    private int maleBirth;
}
