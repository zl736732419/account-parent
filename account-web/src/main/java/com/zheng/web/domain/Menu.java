package com.zheng.web.domain;

import com.zheng.web.enums.EnumTrueFalseStatus;

/**
 * 权限菜单
 * Created by zhenglian on 2017/7/2.
 */
public class Menu {
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 图标
     */
    private String icon;
    /**
     * 排序
     */
    private Integer orderNum;
    /**
     * 状态：0：禁用 1：启用
     */
    private Integer status = EnumTrueFalseStatus.TRUE.getKey();
    /**
     * 点击后访问的地址
     */
    private String url;

    /**
     * 所属应用
     */
    private Integer applicationId;
    /**
     * 所属角色分组
     */
    private Integer menuGroupId;
    /**
     * 父级菜单
     */
    private Integer parentId;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getMenuGroupId() {
        return menuGroupId;
    }

    public void setMenuGroupId(Integer menuGroupId) {
        this.menuGroupId = menuGroupId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
