package com.zheng.web.domain;

import com.zheng.web.enums.EnumTrueFalseStatus;

/**
 * 权限菜单分组
 * Created by zhenglian on 2017/7/2.
 */
public class MenuGroup {
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 排序
     */
    private Integer orderNum;
    /**
     * 是否启用：0：禁用 1：启用
     */
    private Integer status = EnumTrueFalseStatus.TRUE.getKey();

    /**
     * 所属应用
     */
    private Integer applicationId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }
}
