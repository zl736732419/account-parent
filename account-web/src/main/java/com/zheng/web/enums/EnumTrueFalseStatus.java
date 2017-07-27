package com.zheng.web.enums;

/**
 * Created by zhenglian on 2017/7/2.
 */
public enum EnumTrueFalseStatus {
    TRUE(1, "启用", "启用"), 
    FALSE(0, "禁用", "禁用");

    private Integer key;
    private String value;
    private String description;

    EnumTrueFalseStatus(Integer key, String value, String description) {
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
