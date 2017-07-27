package com.zheng.commons.controller;

import com.google.common.collect.Maps;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Optional;

/**
 * 视图生成工厂
 * Created by zhenglian on 2017/6/26.
 */
public class ModelAndViewFactory {
    
    private ModelAndViewFactory() {
    }
    
    public static Builder viewFor(String viewName) {
        return viewFor(viewName, true);
    }
    
    public static Builder viewFor(String viewName, boolean success) {
        if(!Optional.ofNullable(viewName).isPresent()) {
            viewName = "";
        }

        Responser responser;
        if(success) {
            responser = new Responser.Builder().success("操作成功").build();
        }else {
            responser = new Responser.Builder().fail("操作失败").build();
        }
        
        Builder builder = new Builder(viewName, responser);
        return builder;
    }
    
    static class Builder {
        private Responser responser;
        private HashMap<String, Object> params;
        private String viewName;

        public Builder(String viewName, Responser responser) {
            this.viewName = viewName;
            params = Maps.newHashMap();
            this.responser = responser;
        }

        /**
         * 添加参数
         * @param name
         * @param value
         * @return
         */
        public Builder with(String name, Object value) {
            params.put(name, value);
            return this;
        }
        
        public ModelAndView build() {
            ModelAndView mav = new ModelAndView(viewName);
            mav.addObject("status", responser);
            mav.addObject("data", params);
            return mav;
        }

    }
}
