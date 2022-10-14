package com.example.wx.service.response;

import lombok.Data;

/**
 * @author xgh 2022/10/14
 */
@Data
public class WxResponese {
    private int errcode;
    private String errmsg;
    private Long msgid;
}
