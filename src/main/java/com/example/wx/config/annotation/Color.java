package com.example.wx.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用范围 类或者 字段上 都存在是字段上的优先
 * 配置 显示字体的颜色
 * @author xgh 2022/10/12
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Color {
    /**
     * 颜色 e.g. #fff000
     *
     * @return
     */
    String value();
}
