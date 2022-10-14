package com.example.wx;

import com.example.wx.constant.InfoConfig;
import com.example.wx.service.WeatherService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class WxApplication {

    public static void main(String[] args) throws JsonProcessingException {
         ConfigurableApplicationContext context = SpringApplication.run(WxApplication.class, args);
         InfoConfig service = context.getBean(InfoConfig.class);
        System.out.println(service);

    }

}
