package com.example.wx.service.impl;

import com.example.wx.constant.WeatherConfig;
import com.example.wx.constant.entity.PredictInfo;
import com.example.wx.constant.entity.RealInfo;
import com.example.wx.constant.entity.WeatherInfo;
import com.example.wx.service.entity.WeatherRealInfo;
import com.example.wx.service.WeatherService;
import com.example.wx.utils.LunarUtil;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author xgh 2022/10/11
 */
@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    WeatherConfig weatherConfig;

    @SneakyThrows
    @Override
    public WeatherRealInfo getWeatherInfo() {
        final WeatherInfo weather = WeatherConfig.getWeather(weatherConfig);
        final WeatherRealInfo info = new WeatherRealInfo();
        final RealInfo.Weather realWeather = weather.getReal().getWeather();
        final RealInfo.Wind realWind = weather.getReal().getWind();
        info.setHumidity(realWeather.getHumidity());
        info.setCurTemp(realWeather.getTemperature());
        info.setCity(weather.getReal().getStation().getCity());
        info.setDate(getCurDate());
        info.setInfo(realWeather.getInfo());
        final List<PredictInfo.Detail> detail = weather.getPredict().getDetail();
        info.setForecast(getForecast(detail, 2));
        info.setWindDirection(realWind.getDirect());
        info.setWindPower(realWind.getPower());
        final PredictInfo.Detail curDetail = detail.get(0);
        double dayTemp = Double.parseDouble(curDetail.getDay().getWeather().getTemperature());
        final double nightTemp = Double.parseDouble(curDetail.getNight().getWeather().getTemperature());
        if (dayTemp > nightTemp) {
            dayTemp = nightTemp;
        }
        info.setMaxTemp(dayTemp);
        info.setMinTemp(nightTemp);
        return info;
    }



    /**
     * @return e.g 2022-01-01 星期一
     */
    private String getCurDate() {
        final LocalDate now = LocalDate.now();
        final String first = now.toString();
        final DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        return first + " " + LunarUtil.WEEK_MAP.get(dayOfWeek);
    }

    private String getForecast(List<PredictInfo.Detail> details, int days) {
        final int min = Math.min(details.size(), days + 1);
        final StringJoiner joiner = new StringJoiner("  ");
        for (int i = 1; i < min; i++) {
            joiner.add(details.get(i).getDay().getWeather().getInfo());
        }
        return joiner.toString();
    }
}
