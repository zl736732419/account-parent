package com.zheng.web.domain;

import java.util.Date;

/**
 * 权限资源
 * Created by zhenglian on 2017/7/2.
 */
public class ResUrl {
    private Integer id;
    /**
     * url资源
     */
    private String url;
    /**
     * 排序字段
     */
    private Integer orderNum;
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
     * 所属应用
     */
    private Integer applicationId;
    /**
     * 所属模块
     */
    private Integer moduleId;
    /**
     * 所属资源功能点
     */
    private Integer resFunctionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
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

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getResFunctionId() {
        return resFunctionId;
    }

    public void setResFunctionId(Integer resFunctionId) {
        this.resFunctionId = resFunctionId;
    }
}
