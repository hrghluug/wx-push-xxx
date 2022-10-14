package com.example.wx.service.impl;

import com.example.wx.constant.InfoConfig;
import com.example.wx.service.InfoService;
import com.example.wx.service.entity.BasicInfo;
import com.example.wx.utils.LunarUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * @author xgh 2022/10/13
 */
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    InfoConfig infoConfig;

    @Override
    public BasicInfo getBasicInfo() {
        BasicInfo basicInfo = new BasicInfo();
        basicInfo.setFemaleName(infoConfig.getFemaleName());
        basicInfo.setMaleName(infoConfig.getMaleName());
        basicInfo.setTogetherDays(LunarUtil.daysBetween(infoConfig.getTogetherDate(), LocalDate.now())+1);
        basicInfo.setFemaleBirth(calcDays(infoConfig.getFemaleBirth(), infoConfig.isFemaleLunar()));
        basicInfo.setMaleBirth(calcDays(infoConfig.getMaleBirth(), infoConfig.isMaleLunar()));
        return basicInfo;
    }


    /**
     * @param dat   MM-dd
     * @param lunar
     * @return
     */
    private int calcDays(String dat, boolean lunar) {
        LocalDate now = LocalDate.now();
        try {
            if (lunar) {
                for (int i = -1; i < 2; i++) {
                    int curYear = now.getYear() + i;
                    LocalDate lunarDate = LocalDate.parse(curYear + "-" + dat);
                    LocalDate localDate = LunarUtil.lunarToSolar(lunarDate, false);
                    if (!localDate.isBefore(now)) {
                        return LunarUtil.daysBetween(now, localDate);
                    }
                    if (LunarUtil.isLeapMonth(curYear, lunarDate.getMonth().getValue())) {
                        localDate = LunarUtil.lunarToSolar(lunarDate, true);
                        if (localDate.isBefore(now)) {
                            return LunarUtil.daysBetween(now, localDate);
                        }
                    }
                }
            } else {
                String birthStr = now.getYear() + "-" + dat;
                LocalDate birth = LocalDate.parse(birthStr);
                if (birth.isBefore(now)) {
                    birth = birth.plusYears(1);
                }
                return LunarUtil.daysBetween(now, birth);
            }
        } catch (Exception e) {

        }
        return 1314;
    }
}
