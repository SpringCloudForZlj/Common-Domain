package com.xd.common.domain;

/**
 * Created by 张立军 on 2020/1/16.
 * Project Name : SpringCloud
 * Package Name : com.xd.common.domain
 */
public class User {
    Integer id;
    String userid;
    String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
