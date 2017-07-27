package com.zheng.web.enums;

/**
 * 用户状态
 * Created by zhenglian on 2017/6/26.
 */
public enum EnumUserStatus {
    UN_ACTIVE(0, "未激活", "用户刚创建时未激活"),
    ACTIVE(1, "正常", "用户激活后的状态"),
    DISABLE(2, "禁用", "账号禁用"),
    PASSWORD_EXPIRE(3, "密码失效", "密码失效");

    private Integer key;
    private String value;
    private String description;

    EnumUserStatus(Integer key, String value, String description) {
        this.key = key;
        this.value = value;
        this.description = description;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
