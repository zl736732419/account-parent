package com.zheng.web.domain;

import com.zheng.web.enums.EnumTrueFalseStatus;

import java.util.Date;

/**
 * 应用实体
 * Created by zhenglian on 2017/7/2.
 */
public class Application {
    private Integer id;
    /**
     * 应用名称
     */
    private String name;
    /**
     * 应用英文唯一标识
     */
    private String key;
    /**
     * 应用状态  1：启用，2： 禁用
     */
    private Integer status = EnumTrueFalseStatus.TRUE.getKey();
    /**
     * 首页地址
     */
    private String indexUrl;
    /**
     * 图标
     */
    private String icon;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIndexUrl() {
        return indexUrl;
    }

    public void setIndexUrl(String indexUrl) {
        this.indexUrl = indexUrl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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
}
