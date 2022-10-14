package com.example.wx.service.response;

import lombok.Data;

/**
 * @author xgh 2022/10/14
 */
@Data
public class WxAccessTokenResponse {
    private String access_token;
    private int expires_in;
}
