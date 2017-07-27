package com.zheng.commons.exception;

/**
 * 业务异常类
 * Created by zhenglian on 2017/6/22.
 */
public class ServiceException extends RuntimeException {
    private String code;
    
    public ServiceException(String message, Throwable throwable) {
        super(message,throwable);
    }
    
    public ServiceException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }
    
    public ServiceException(String message) {
        super(message);
    }
    
    public ServiceException(Throwable throwable) {
        super(throwable);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
