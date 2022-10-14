package com.example.wx.constant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @author xgh
 */
@Data
@Component
@ConfigurationProperties(prefix = "wx.config")
public class WXConfig {
    /**
     * appId
     */
    public String appId;
    /**
     * 密钥
     */
    public String appSecret;
    /**
     * 模板id
     */
    public String templateId;
    /**
     * 需要推送的用户
     */
    public String[] openidList;

}
