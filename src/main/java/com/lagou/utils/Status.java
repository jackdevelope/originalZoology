package com.lagou.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * 通用状态枚举类
 * {msg:信息，status:状态}
 */
public enum Status {
    SUCCESS("success"), FAIL("fail");
    private String msg;

    Status() {
    }
    Status(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        JSONObject signcontainer = new JSONObject();
        signcontainer.put("msg", msg);
        return signcontainer.toString();
    }
}
