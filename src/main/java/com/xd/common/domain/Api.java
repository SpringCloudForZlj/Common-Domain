package com.xd.common.domain;

/**
 * Created by 张立军 on 2020/1/16.
 * Project Name : SpringCloud
 * Package Name : com.xd.common.domain
 */
public class Api {
    Integer code;
    String message;
    Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
