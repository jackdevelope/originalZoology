package com.lagou.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * 通用状态枚举类
 * {msg:信息，status:状态}
 */
public enum StatusCode {
    SUCCESS("success", 0), FAIL("fail", 1);
    private String msg;
    private int status;

    StatusCode() {
    }
    StatusCode(String msg, int status) {
        this.msg = msg;
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        JSONObject signcontainer = new JSONObject();
        signcontainer.put("msg", msg);
        signcontainer.put("status", status);
        return signcontainer.toString();
    }
}
