package com.example.wx.service.impl;

import com.example.wx.service.WordService;
import com.example.wx.service.entity.WordInfo;
import org.springframework.stereotype.Service;
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
public class WordServiceImpl implements WordService {
    static final Map<String, String> proverb = new HashMap<>();

    static final List<String> morning = new ArrayList<>();
    static final List<String> randomKeyList = new ArrayList<>();

    static {
        URL url = ClassLoader.getSystemClassLoader().getResource("proverbZh2En.properties");
        try (BufferedReader bufferedReader
                     = new BufferedReader(new InputStreamReader(url.openStream()))) {
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
        url = ClassLoader.getSystemClassLoader().getResource("morning.txt");
        try (BufferedReader bufferedReader
                     = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                if (StringUtils.hasText(str)) {
                    if (!str.trim().startsWith("--")) {
                        morning.add(str.trim());
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
