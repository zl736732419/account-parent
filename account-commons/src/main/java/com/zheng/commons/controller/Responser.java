package com.zheng.commons.controller;

/**
 * 返回状态码，所有请求响应都应该携带
 * Created by zhenglian on 2017/6/26.
 */
public class Responser {
    private boolean success = true;
    private String message;

    private Responser() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    static class Builder {
        private Responser responser = new Responser();
        
        public Builder success(String message) {
            responser.setSuccess(true);
            responser.setMessage(message);
            return this;
        }
        
        public Builder fail(String message) {
            responser.setSuccess(false);
            responser.setMessage(message);
            return this;
        }
        
        public Builder success(boolean success) {
            responser.setSuccess(success);
            return this;
        }
        
        public Builder message(String message) {
            responser.setMessage(message);
            return this;
        }
        
        public Responser build() {
            return responser;
        }
        
    }
}
