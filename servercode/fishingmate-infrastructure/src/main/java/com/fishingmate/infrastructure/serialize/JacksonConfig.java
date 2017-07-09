package com.fishingmate.infrastructure.serialize;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Provider
public class JacksonConfig implements ContextResolver<ObjectMapper> {

    private final ObjectMapper objectMapper;


    public JacksonConfig() {
        objectMapper = new ObjectMapper();

        objectMapper.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


        // 对enum使用toString()方法序列化 如果没有重写toString方法则默认使用Enum.name() 与名称一样
        // objectMapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING,true);
        // 对enum反序列化使用 toString()
        // objectMapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING,true);


        // 解析.NET客戶端传入的时间格式
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        objectMapper.setDateFormat(dateFormat);
    }

    @Override
    public ObjectMapper getContext(Class<?> type) {
        return objectMapper;
    }

}
