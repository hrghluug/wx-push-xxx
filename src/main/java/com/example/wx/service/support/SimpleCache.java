package com.example.wx.service.support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xgh 2022/10/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleCache {
    public String accessToken;
    public long timeStamp;

    public boolean expired() {
        if (System.currentTimeMillis()<=timeStamp){
            return true;
        }
        return false;
    }
}
