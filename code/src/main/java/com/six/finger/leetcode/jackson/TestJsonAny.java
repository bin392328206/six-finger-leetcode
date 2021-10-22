package com.six.finger.leetcode.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/9/24 15:39
 */
public class TestJsonAny {
    public static void main(String[] args) {
        String json = "{\"name\":\"My bean\",\"attr2\":\"val2\",\"attr1\":\"val1\",\"age\":\"18\",\"date\":\"20-12-2014 02:30:00\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ExtendableBean bean = objectMapper
                    .readerFor(ExtendableBean.class)
                    .readValue(json);
            System.out.println(bean);
            System.out.println(objectMapper.writeValueAsString(bean));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
