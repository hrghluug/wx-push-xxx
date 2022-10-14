package com.example.wx.constant.entity;

import lombok.Data;

import java.util.List;

/**
 * 中央气象台信息
 *
 * @author xgh 2022/10/11
 */
@Data
public class WeatherInfo {
    private RealInfo real;

    private PredictInfo predict;

    private AirInfo air;

    private List<TempChartInfo> tempchart;

    private List<PassedChartInfo> passedchart;

    private ClimateInfo climate;

    private RadarInfo radar;
}

/**
 * {
 *     "msg": "success",
 *     "code": 0,
 *     "data": {
 *         "real": {
 *             "station": {
 *                 "code": "58847",
 *                 "province": "福建省",
 *                 "city": "福州",
 *                 "url": "/publish/forecast/AFJ/fuzhou.html"
 *             },
 *             "publish_time": "2022-10-11 22:30",
 *             "weather": {
 *                 "temperature": 18.8,
 *                 "temperatureDiff": -0.6,
 *                 "airpressure": 9999.0,
 *                 "humidity": 39.0,
 *                 "rain": 0.0,
 *                 "rcomfort": 57,
 *                 "icomfort": -1,
 *                 "info": "晴",
 *                 "img": "0",
 *                 "feelst": 16.0
 *             },
 *             "wind": {
 *                 "direct": "西北风",
 *                 "degree": 355.0,
 *                 "power": "微风",
 *                 "speed": 3.0
 *             },
 *             "warn": {
 *                 "alert": "9999",
 *                 "pic": "9999",
 *                 "province": "9999",
 *                 "city": "9999",
 *                 "url": "9999",
 *                 "issuecontent": "9999",
 *                 "fmeans": "9999",
 *                 "signaltype": "9999",
 *                 "signallevel": "9999",
 *                 "pic2": "9999"
 *             }
 *         },
 *         "predict": {
 *             "station": {
 *                 "code": "58847",
 *                 "province": "福建省",
 *                 "city": "福州",
 *                 "url": "/publish/forecast/AFJ/fuzhou.html"
 *             },
 *             "publish_time": "2022-10-11 20:00",
 *             "detail": [
 *                 {
 *                     "date": "2022-10-11",
 *                     "pt": "2022-10-11 20:00",
 *                     "day": {
 *                         "weather": {
 *                             "info": "9999",
 *                             "img": "9999",
 *                             "temperature": "9999"
 *                         },
 *                         "wind": {
 *                             "direct": "9999",
 *                             "power": "9999"
 *                         }
 *                     },
 *                     "night": {
 *                         "weather": {
 *                             "info": "阴",
 *                             "img": "2",
 *                             "temperature": "18"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     }
 *                 },
 *                 {
 *                     "date": "2022-10-12",
 *                     "pt": "2022-10-11 20:00",
 *                     "day": {
 *                         "weather": {
 *                             "info": "阴",
 *                             "img": "2",
 *                             "temperature": "25"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     },
 *                     "night": {
 *                         "weather": {
 *                             "info": "多云",
 *                             "img": "1",
 *                             "temperature": "19"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     }
 *                 },
 *                 {
 *                     "date": "2022-10-13",
 *                     "pt": "2022-10-11 20:00",
 *                     "day": {
 *                         "weather": {
 *                             "info": "多云",
 *                             "img": "1",
 *                             "temperature": "29"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     },
 *                     "night": {
 *                         "weather": {
 *                             "info": "多云",
 *                             "img": "1",
 *                             "temperature": "19"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     }
 *                 },
 *                 {
 *                     "date": "2022-10-14",
 *                     "pt": "2022-10-11 20:00",
 *                     "day": {
 *                         "weather": {
 *                             "info": "晴",
 *                             "img": "0",
 *                             "temperature": "29"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     },
 *                     "night": {
 *                         "weather": {
 *                             "info": "多云",
 *                             "img": "1",
 *                             "temperature": "22"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     }
 *                 },
 *                 {
 *                     "date": "2022-10-15",
 *                     "pt": "2022-10-11 20:00",
 *                     "day": {
 *                         "weather": {
 *                             "info": "阴",
 *                             "img": "2",
 *                             "temperature": "31"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     },
 *                     "night": {
 *                         "weather": {
 *                             "info": "阴",
 *                             "img": "2",
 *                             "temperature": "25"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     }
 *                 },
 *                 {
 *                     "date": "2022-10-16",
 *                     "pt": "2022-10-11 20:00",
 *                     "day": {
 *                         "weather": {
 *                             "info": "小雨",
 *                             "img": "7",
 *                             "temperature": "28"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     },
 *                     "night": {
 *                         "weather": {
 *                             "info": "大雨",
 *                             "img": "9",
 *                             "temperature": "21"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     }
 *                 },
 *                 {
 *                     "date": "2022-10-17",
 *                     "pt": "2022-10-11 20:00",
 *                     "day": {
 *                         "weather": {
 *                             "info": "小雨",
 *                             "img": "7",
 *                             "temperature": "25"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     },
 *                     "night": {
 *                         "weather": {
 *                             "info": "阴",
 *                             "img": "2",
 *                             "temperature": "18"
 *                         },
 *                         "wind": {
 *                             "direct": "无持续风向",
 *                             "power": "微风"
 *                         }
 *                     }
 *                 }
 *             ]
 *         },
 *         "air": {
 *             "forecasttime": "2022-10-11 21:00",
 *             "aqi": 36,
 *             "aq": 1,
 *             "text": "优",
 *             "aqiCode": "99104;99105;99106"
 *         },
 *         "tempchart": [
 *             {
 *                 "time": "2022/10/04",
 *                 "max_temp": 36.9,
 *                 "min_temp": 25.1,
 *                 "day_img": "9999",
 *                 "day_text": "9999",
 *                 "night_img": "9999",
 *                 "night_text": "9999"
 *             },
 *             {
 *                 "time": "2022/10/05",
 *                 "max_temp": 27.1,
 *                 "min_temp": 23.9,
 *                 "day_img": "9999",
 *                 "day_text": "9999",
 *                 "night_img": "9999",
 *                 "night_text": "9999"
 *             },
 *             {
 *                 "time": "2022/10/06",
 *                 "max_temp": 26.4,
 *                 "min_temp": 23.7,
 *                 "day_img": "9999",
 *                 "day_text": "9999",
 *                 "night_img": "9999",
 *                 "night_text": "9999"
 *             },
 *             {
 *                 "time": "2022/10/07",
 *                 "max_temp": 27.1,
 *                 "min_temp": 22.1,
 *                 "day_img": "9999",
 *                 "day_text": "9999",
 *                 "night_img": "9999",
 *                 "night_text": "9999"
 *             },
 *             {
 *                 "time": "2022/10/08",
 *                 "max_temp": 25.0,
 *                 "min_temp": 21.3,
 *                 "day_img": "9999",
 *                 "day_text": "9999",
 *                 "night_img": "9999",
 *                 "night_text": "9999"
 *             },
 *             {
 *                 "time": "2022/10/09",
 *                 "max_temp": 30.2,
 *                 "min_temp": 20.5,
 *                 "day_img": "9999",
 *                 "day_text": "9999",
 *                 "night_img": "9999",
 *                 "night_text": "9999"
 *             },
 *             {
 *                 "time": "2022/10/10",
 *                 "max_temp": 26.4,
 *                 "min_temp": 17.6,
 *                 "day_img": "9999",
 *                 "day_text": "9999",
 *                 "night_img": "9999",
 *                 "night_text": "9999"
 *             },
 *             {
 *                 "time": "2022/10/11",
 *                 "max_temp": 9999.0,
 *                 "min_temp": 18.0,
 *                 "day_img": "9999",
 *                 "day_text": "9999",
 *                 "night_img": "2",
 *                 "night_text": "阴"
 *             },
 *             {
 *                 "time": "2022/10/12",
 *                 "max_temp": 25.0,
 *                 "min_temp": 19.0,
 *                 "day_img": "2",
 *                 "day_text": "阴",
 *                 "night_img": "1",
 *                 "night_text": "多云"
 *             },
 *             {
 *                 "time": "2022/10/13",
 *                 "max_temp": 29.0,
 *                 "min_temp": 19.0,
 *                 "day_img": "1",
 *                 "day_text": "多云",
 *                 "night_img": "1",
 *                 "night_text": "多云"
 *             },
 *             {
 *                 "time": "2022/10/14",
 *                 "max_temp": 29.0,
 *                 "min_temp": 22.0,
 *                 "day_img": "0",
 *                 "day_text": "晴",
 *                 "night_img": "1",
 *                 "night_text": "多云"
 *             },
 *             {
 *                 "time": "2022/10/15",
 *                 "max_temp": 31.0,
 *                 "min_temp": 25.0,
 *                 "day_img": "2",
 *                 "day_text": "阴",
 *                 "night_img": "2",
 *                 "night_text": "阴"
 *             },
 *             {
 *                 "time": "2022/10/16",
 *                 "max_temp": 28.0,
 *                 "min_temp": 21.0,
 *                 "day_img": "7",
 *                 "day_text": "小雨",
 *                 "night_img": "9",
 *                 "night_text": "大雨"
 *             },
 *             {
 *                 "time": "2022/10/17",
 *                 "max_temp": 25.0,
 *                 "min_temp": 18.0,
 *                 "day_img": "7",
 *                 "day_text": "小雨",
 *                 "night_img": "2",
 *                 "night_text": "阴"
 *             }
 *         ],
 *         "passedchart": [
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 18.9,
 *                 "tempDiff": "",
 *                 "humidity": 42.0,
 *                 "pressure": 1011.0,
 *                 "windDirection": 329.0,
 *                 "windSpeed": 4.1,
 *                 "time": "2022-10-11 22:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 19.4,
 *                 "tempDiff": "",
 *                 "humidity": 39.0,
 *                 "pressure": 1011.0,
 *                 "windDirection": 360.0,
 *                 "windSpeed": 6.3,
 *                 "time": "2022-10-11 21:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 19.4,
 *                 "tempDiff": "",
 *                 "humidity": 43.0,
 *                 "pressure": 1011.0,
 *                 "windDirection": 43.0,
 *                 "windSpeed": 6.7,
 *                 "time": "2022-10-11 20:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 19.8,
 *                 "tempDiff": "",
 *                 "humidity": 38.0,
 *                 "pressure": 1011.0,
 *                 "windDirection": 62.0,
 *                 "windSpeed": 3.5,
 *                 "time": "2022-10-11 19:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 20.5,
 *                 "tempDiff": "",
 *                 "humidity": 29.0,
 *                 "pressure": 1010.0,
 *                 "windDirection": 17.0,
 *                 "windSpeed": 7.5,
 *                 "time": "2022-10-11 18:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 21.5,
 *                 "tempDiff": "",
 *                 "humidity": 24.0,
 *                 "pressure": 1010.0,
 *                 "windDirection": 65.0,
 *                 "windSpeed": 5.3,
 *                 "time": "2022-10-11 17:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 22.3,
 *                 "tempDiff": "",
 *                 "humidity": 22.0,
 *                 "pressure": 1009.0,
 *                 "windDirection": 88.0,
 *                 "windSpeed": 7.1,
 *                 "time": "2022-10-11 16:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 23.6,
 *                 "tempDiff": "",
 *                 "humidity": 20.0,
 *                 "pressure": 1009.0,
 *                 "windDirection": 65.0,
 *                 "windSpeed": 6.0,
 *                 "time": "2022-10-11 15:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 23.2,
 *                 "tempDiff": "",
 *                 "humidity": 20.0,
 *                 "pressure": 1010.0,
 *                 "windDirection": 48.0,
 *                 "windSpeed": 3.8,
 *                 "time": "2022-10-11 14:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 24.0,
 *                 "tempDiff": "",
 *                 "humidity": 21.0,
 *                 "pressure": 1010.0,
 *                 "windDirection": 99.0,
 *                 "windSpeed": 5.3,
 *                 "time": "2022-10-11 13:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 22.3,
 *                 "tempDiff": "",
 *                 "humidity": 20.0,
 *                 "pressure": 1011.0,
 *                 "windDirection": 360.0,
 *                 "windSpeed": 4.9,
 *                 "time": "2022-10-11 12:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 21.7,
 *                 "tempDiff": "",
 *                 "humidity": 22.0,
 *                 "pressure": 1012.0,
 *                 "windDirection": 60.0,
 *                 "windSpeed": 5.8,
 *                 "time": "2022-10-11 11:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 20.2,
 *                 "tempDiff": "",
 *                 "humidity": 30.0,
 *                 "pressure": 1013.0,
 *                 "windDirection": 48.0,
 *                 "windSpeed": 4.3,
 *                 "time": "2022-10-11 10:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 19.3,
 *                 "tempDiff": "",
 *                 "humidity": 31.0,
 *                 "pressure": 1013.0,
 *                 "windDirection": 26.0,
 *                 "windSpeed": 7.0,
 *                 "time": "2022-10-11 09:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 18.5,
 *                 "tempDiff": "",
 *                 "humidity": 35.0,
 *                 "pressure": 1013.0,
 *                 "windDirection": 9.0,
 *                 "windSpeed": 5.0,
 *                 "time": "2022-10-11 08:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 17.7,
 *                 "tempDiff": "",
 *                 "humidity": 39.0,
 *                 "pressure": 1013.0,
 *                 "windDirection": 312.0,
 *                 "windSpeed": 2.0,
 *                 "time": "2022-10-11 07:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 17.2,
 *                 "tempDiff": "",
 *                 "humidity": 41.0,
 *                 "pressure": 1012.0,
 *                 "windDirection": 312.0,
 *                 "windSpeed": 1.5,
 *                 "time": "2022-10-11 06:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 17.7,
 *                 "tempDiff": "",
 *                 "humidity": 35.0,
 *                 "pressure": 1011.0,
 *                 "windDirection": 43.0,
 *                 "windSpeed": 6.0,
 *                 "time": "2022-10-11 05:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 17.9,
 *                 "tempDiff": "",
 *                 "humidity": 36.0,
 *                 "pressure": 1011.0,
 *                 "windDirection": 9.0,
 *                 "windSpeed": 5.3,
 *                 "time": "2022-10-11 04:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 17.9,
 *                 "tempDiff": "",
 *                 "humidity": 50.0,
 *                 "pressure": 1011.0,
 *                 "windDirection": 320.0,
 *                 "windSpeed": 3.5,
 *                 "time": "2022-10-11 03:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 18.0,
 *                 "tempDiff": "",
 *                 "humidity": 51.0,
 *                 "pressure": 1011.0,
 *                 "windDirection": 323.0,
 *                 "windSpeed": 2.2,
 *                 "time": "2022-10-11 02:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 18.5,
 *                 "tempDiff": "",
 *                 "humidity": 49.0,
 *                 "pressure": 1011.0,
 *                 "windDirection": 343.0,
 *                 "windSpeed": 2.7,
 *                 "time": "2022-10-11 01:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 19.3,
 *                 "tempDiff": "",
 *                 "humidity": 44.0,
 *                 "pressure": 1012.0,
 *                 "windDirection": 3.0,
 *                 "windSpeed": 4.3,
 *                 "time": "2022-10-11 00:00"
 *             },
 *             {
 *                 "rain1h": 0.0,
 *                 "rain24h": 9999.0,
 *                 "rain12h": 9999.0,
 *                 "rain6h": 9999.0,
 *                 "temperature": 19.0,
 *                 "tempDiff": "",
 *                 "humidity": 52.0,
 *                 "pressure": 1012.0,
 *                 "windDirection": 323.0,
 *                 "windSpeed": 2.0,
 *                 "time": "2022-10-10 23:00"
 *             }
 *         ],
 *         "climate": {
 *             "time": "1981年-2010年",
 *             "month": [
 *                 {
 *                     "month": 1,
 *                     "maxTemp": 15.8,
 *                     "minTemp": 8.7,
 *                     "precipitation": 49.9
 *                 },
 *                 {
 *                     "month": 2,
 *                     "maxTemp": 16.7,
 *                     "minTemp": 9.3,
 *                     "precipitation": 84.9
 *                 },
 *                 {
 *                     "month": 3,
 *                     "maxTemp": 19.2,
 *                     "minTemp": 11.2,
 *                     "precipitation": 141.5
 *                 },
 *                 {
 *                     "month": 4,
 *                     "maxTemp": 23.9,
 *                     "minTemp": 15.6,
 *                     "precipitation": 154.4
 *                 },
 *                 {
 *                     "month": 5,
 *                     "maxTemp": 27.7,
 *                     "minTemp": 19.8,
 *                     "precipitation": 187.8
 *                 },
 *                 {
 *                     "month": 6,
 *                     "maxTemp": 30.9,
 *                     "minTemp": 23.4,
 *                     "precipitation": 202.0
 *                 },
 *                 {
 *                     "month": 7,
 *                     "maxTemp": 34.5,
 *                     "minTemp": 25.9,
 *                     "precipitation": 123.0
 *                 },
 *                 {
 *                     "month": 8,
 *                     "maxTemp": 33.7,
 *                     "minTemp": 25.6,
 *                     "precipitation": 169.4
 *                 },
 *                 {
 *                     "month": 9,
 *                     "maxTemp": 31.0,
 *                     "minTemp": 23.7,
 *                     "precipitation": 156.4
 *                 },
 *                 {
 *                     "month": 10,
 *                     "maxTemp": 27.0,
 *                     "minTemp": 19.7,
 *                     "precipitation": 47.6
 *                 },
 *                 {
 *                     "month": 11,
 *                     "maxTemp": 22.7,
 *                     "minTemp": 15.5,
 *                     "precipitation": 40.9
 *                 },
 *                 {
 *                     "month": 12,
 *                     "maxTemp": 18.1,
 *                     "minTemp": 10.9,
 *                     "precipitation": 34.0
 *                 }
 *             ]
 *         },
 *         "radar": {
 *             "title": "福州",
 *             "image": "/product/2022/10/11/RDCP/SEVP_AOC_RDCP_SLDAS_EBREF_AZ9591_L88_PI_20221011144200000.PNG?v=1665499416562",
 *             "url": "/publish/radar/fu-jian/fu-zhou.htm"
 *         }
 *     }
 * }
 */