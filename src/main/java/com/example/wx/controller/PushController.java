package com.example.wx.controller;

import com.example.wx.constant.WXConfig;
import com.example.wx.service.PushService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xgh 2022/10/12
 */
@RestController
public class PushController {
    @Autowired
    PushService pushService;
    @Autowired
    WXConfig wxConfig;


    @PostMapping("send")
    public void send() {
        pushService.send();
    }

    @PutMapping("template/{templateId}")
    public String send(@PathVariable("templateId") String templateId) {
        wxConfig.setTemplateId(templateId);
        return "设置模板id为:{" + templateId + "}";
    }


}
