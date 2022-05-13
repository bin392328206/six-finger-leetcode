package com.six.finger.leetcode;


import com.alibaba.fastjson.JSON;

import java.util.Random;

public class A {

    private String regular;

    private  String str;


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public static void main(String[] args) {
        String s="\n" +
                "{\"regular\":\"业务资格校验[\\\\d\\\\w\\\\s\\\\D\\\\W\\\\S]+失败\",\"str\":\"业务资格校验|省份|[用户省code]|[用户所在省]|城市|[用户市code]|[用户所在市]|触点|[业务码]失败\"}";

        A a = JSON.parseObject(s, A.class);
        System.out.println(a);



    }
}
