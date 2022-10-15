```yaml
#微信公众号测试号申请链接 https://mp.weixin.qq.com/debug/cgi-bin/sandbox?t=sandbox/login
wx:
  config:
    appId: "your appId"
    appSecret: "your appSecret"
    templateId: "模板信息的id"
    openidList:
      - "发送给谁 Id"
weather:
  config:
    #    http://www.nmc.cn/rest/province/A${Province}  Province= 省份前两个首字母大写
    #    省份 首字母 查询http://www.nmc.cn/rest/province
    #  like 福建省   http://www.nmc.cn/rest/province/AFJ   城市code 查询
    city: 58847
info:
  config:
    # 男生名称 
    maleName: "阿强"
    # 男生生日
    maleBirth: "10-15"
    # 男生是否是农历生日
    maleLunar: false
    femaleName: "阿珍"
    femaleBirth: "09-20"
    femaleLunar: true
    #  在一起时间
    togetherDate: "2022-10-14"
```

### 模板信息 
{{date.DATA}}  {{city.DATA}}

{{message.DATA}}
天气：{{info.DATA}} 气温：{{minTemp.DATA}}~{{maxTemp.DATA}}  当前气温：{{curTemp.DATA}}
风力：{{windPower.DATA}}  风向：{{windDirection.DATA}}  湿度：{{humidity.DATA}}
明天~后天：{{forecast.DATA}}
♥在一起♥:{{togetherDays.DATA}}
距离{{femaleName.DATA}}生日：{{femaleBirth.DATA}}天
距离{{maleName.DATA}}生日：{{maleBirth.DATA}}天

{{proverb_En.DATA}}
{{proverb_Zh.DATA}}


```java
/**
 * 显示的颜色由color注解控制
 */
@Data
@Color("#ffea00")
public class WordInfo {
    @Color("#123456")
    @JsonSerialize(using = WxJsonSerializer.class)
    private String proverb_En;
    @JsonSerialize(using = WxJsonSerializer.class)
    private String proverb_Zh;
    @JsonSerialize(using = WxJsonSerializer.class)
    private String message;
}
```

主动发送接口: {yourIp}:{yourPort}/send 
更换模板接口: {yourIp}:{yourPort}/template/{templateId}  


中文乱码问题: 
添加 jvm 参数 -Dfile.encoding=UTF-8