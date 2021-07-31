package com.six.finger.leetcode.hash;


import com.alibaba.fastjson.JSON;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/7/30 16:27
 */
public class TapCreateTokenRsp {
   private String id;


    public static void main(String[] args) {

        String a="{\n" +
                "  \"id\": \"tok_Zmo4N2hkMXkxOGltZzA4MnNvNnU\",\n" +
                "  \"object\": \"token\",\n" +
                "  \"card\": {\n" +
                "    \"id\": \"card_Zmo4N2hkMXkxOGltZzA4MnNvNnU\",\n" +
                "    \"object\": \"card\",\n" +
                "    \"last4\": \"0005\",\n" +
                "    \"exp_month\": 12,\n" +
                "    \"exp_year\": 19,\n" +
                "    \"brand\": \"American Express\",\n" +
                "    \"name\": \"test user\",\n" +
                "    \"address_line1\": \"\",\n" +
                "    \"address_country\": \"\",\n" +
                "    \"address_city\": \"\",\n" +
                "    \"phone_number\": \"\",\n" +
                "    \"address_zip\": 0\n" +
                "  },\n" +
                "  \"type\": \"card\",\n" +
                "  \"created\": 1517380819\n" +
                "}";

        TapCreateTokenRsp tapCreateTokenRsp = JSON.parseObject(a, TapCreateTokenRsp.class);
        System.out.println(tapCreateTokenRsp);

    }
}
