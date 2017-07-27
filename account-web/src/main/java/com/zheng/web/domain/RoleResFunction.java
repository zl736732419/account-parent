package com.zheng.web.domain;

/**
 * 角色与权限功能点关联实体
 * Created by zhenglian on 2017/7/2.
 */
public class RoleResFunction {
    private Integer id;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 功能点id
     */
    private Integer resFunctionId;

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

    public Integer getResFunctionId() {
        return resFunctionId;
    }

    public void setResFunctionId(Integer resFunctionId) {
        this.resFunctionId = resFunctionId;
    }
}
