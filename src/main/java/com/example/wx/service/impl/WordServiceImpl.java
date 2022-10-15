package com.example.wx.service.impl;

import com.example.wx.service.WordService;
import com.example.wx.service.entity.WordInfo;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

/**
 * @author xgh 2022/10/13
 */
@Service
public class WordServiceImpl implements WordService, ResourceLoaderAware {
    final Map<String, String> proverb = new HashMap<>();

    final List<String> morning = new ArrayList<>();
    final List<String> randomKeyList = new ArrayList<>();

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        Resource proverbResource = resourceLoader.getResource("classpath:proverbZh2En.properties");
        Assert.state(proverbResource.exists(),"读取不到文件:proverbZh2En.properties");
        try (BufferedReader bufferedReader
                     = new BufferedReader(new InputStreamReader(proverbResource.getInputStream(),"UTF-8"))) {
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                if (StringUtils.hasText(str)) {
                    final String[] arr = str.split("=");
                    String zh = arr[0].trim();
                    proverb.put(zh, arr[1].trim());
                    randomKeyList.add(zh);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Resource morning = resourceLoader.getResource("classpath:morning.txt");
        Assert.state(morning.exists(),"读取不到文件:morning.txt");
        try (BufferedReader bufferedReader
                     = new BufferedReader(new InputStreamReader(morning.getInputStream(),"UTF-8"))) {
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                if (StringUtils.hasText(str)) {
                    if (!str.trim().startsWith("--")) {
                        this.morning.add(str.trim());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public WordInfo getWordInfo() {
        WordInfo info = new WordInfo();
        Random random = new Random();
        String proverb_Zh = randomKeyList.get(random.nextInt(randomKeyList.size()));
        String proverb_En = proverb.get(proverb_Zh);
        info.setProverb_En(proverb_En);
        info.setProverb_Zh(proverb_Zh);
        String message = morning.get(random.nextInt(morning.size()));
        info.setMessage(message);
        return info;
    }

}
