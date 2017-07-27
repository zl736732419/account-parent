package com.zheng.web.domain;

import com.zheng.web.enums.EnumTrueFalseStatus;

import java.util.Date;

/**
 * 角色实体
 * Created by zhenglian on 2017/7/2.
 */
public class Role {
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 唯一英文标识
     */
    private String key;
    /**
     * 图标
     */
    private String icon;
    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * 角色状态
     */
    private Integer status = EnumTrueFalseStatus.TRUE.getKey();
    
    /**
     * 描述
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 角色所属应用
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }
}
