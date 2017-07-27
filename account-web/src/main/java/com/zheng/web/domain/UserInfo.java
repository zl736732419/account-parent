package com.zheng.web.domain;

/**
 * 用户详情信息
 * Created by zhenglian on 2017/6/26.
 */
public class UserInfo {

    private Integer id;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 爱好
     */
    private String hobby;
    /**
     * 座右铭
     */
    private String motto;

    /**
     * 头像
     */
    private String avator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }
}
