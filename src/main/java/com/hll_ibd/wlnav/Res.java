package com.hll_ibd.wlnav;

import java.util.HashMap;

/**
 * 常规返回格式模板
 * @param <T>
 */
public class Res<T extends HashMap<String,String>> {

    private int ret;
    private String msg;
    private T data;


    /**
     * 常规格式返回
     * @param ret
     * @param msg
     * @param data
     */
    public Res(int ret, String msg, T data) {
        this.ret = ret;
        this.msg = msg;
        this.data = data;
    }

    public int getRet() {
        return ret;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}