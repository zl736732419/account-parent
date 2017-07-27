package com.zheng.web.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换器
 * Created by zhenglian on 2017/6/23.
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 日期不进行严格计算，如果传入非法年月日则抛出异常
        sdf.setLenient(false);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
