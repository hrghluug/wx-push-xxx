package com.example.wx.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xgh 2022/10/12
 */
@Configuration("config")
public class CustomConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
