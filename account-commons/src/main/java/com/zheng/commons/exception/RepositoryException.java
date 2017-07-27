package com.zheng.commons.exception;

/**
 * 数据异常类
 * Created by zhenglian on 2017/6/22.
 */
public class RepositoryException extends RuntimeException {
    private String code;
    
    public RepositoryException(String message, Throwable throwable) {
        super(message,throwable);
    }
    
    public RepositoryException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }
    
    public RepositoryException(String message) {
        super(message);
    }
    
    public RepositoryException(Throwable throwable) {
        super(throwable);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
