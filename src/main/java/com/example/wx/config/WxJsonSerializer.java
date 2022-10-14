package com.example.wx.config;

import com.example.wx.config.annotation.Color;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import org.springframework.lang.Nullable;

import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

/**
 * @author xgh 2022/10/12
 */
public class WxJsonSerializer extends JsonSerializer implements ContextualSerializer {
    public WxJsonSerializer() {
        this.typeColor = null;
        this.fieldColor = null;
    }

    /**
     * 黑色
     */
    private static final String BLACK = "#000000";
    public static String DEFAULT_COLOR = BLACK;
    private static final String WHITE = "#FFFFFF";
    private final Color typeColor;
    private final Color fieldColor;

    public WxJsonSerializer(@Nullable Color typeColor, @Nullable Color fieldColor) {
        this.typeColor = typeColor;
        this.fieldColor = fieldColor;
    }

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        final HashMap<String, String> map = new HashMap<>(2);
        map.put("value", String.valueOf(o));
        final String color = Optional.ofNullable(fieldColor).map(Color::value)
                .orElse(Optional.ofNullable(typeColor).map(Color::value).orElse(DEFAULT_COLOR));
        map.put("color", color);
        jsonGenerator.writeObject(map);
    }

    @Override
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        if (beanProperty==null){
            return this;
        }
        final Color fieldColor = beanProperty.getAnnotation(Color.class);
        final PropertyMetadata metadata = beanProperty.getMetadata();
        final Color typeColor = beanProperty.getMember().getDeclaringClass().getAnnotation(Color.class);
        return new WxJsonSerializer(typeColor, fieldColor);
    }
}
