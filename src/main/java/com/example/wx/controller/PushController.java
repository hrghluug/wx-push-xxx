package com.example.wx.controller;

import com.example.wx.service.PushService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xgh 2022/10/12
 */
@RestController
public class PushController {
    @Autowired
    PushService pushService;

    @PostMapping("send")
    public BasicResponse send() {
        pushService.send();
        return new BasicResponse();
    }

    @Data
    public class BasicResponse {
        String message;
        int code = 200;
        Object date;
    }

}
