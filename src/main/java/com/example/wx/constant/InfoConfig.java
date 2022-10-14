package com.example.wx.constant;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author xgh 2022/10/10
 */
@Component
@ConfigurationProperties(prefix = "info.config")
@Data
public class InfoConfig {
    /**
     * maleName: "阿强"
     * femaleName: "阿珍"
     * maleBirthday: "11-20"
     * maleLunar: false
     * femaleBirthday: "08-31"
     * femaleLunar: false
     * togetherDate: "2021-04-23"
     */

    private String maleName;
    private String femaleName;
    private LocalDate togetherDate;
    private String maleBirth;
    private boolean maleLunar = false;
    private String femaleBirth;
    /**
     * 是否是农历
     */
    private boolean femaleLunar = false;

    public void setTogetherDate(String togetherDate) {
        this.togetherDate = LocalDate.parse(togetherDate);
    }

}
