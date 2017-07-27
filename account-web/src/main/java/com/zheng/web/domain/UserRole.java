package com.zheng.web.domain;

/**
 * 用户角色关联表
 * Created by zhenglian on 2017/7/2.
 */
public class UserRole {
    private Integer id;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 用户id
     */
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
