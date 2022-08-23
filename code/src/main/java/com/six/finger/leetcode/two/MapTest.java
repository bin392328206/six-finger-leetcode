package com.six.finger.leetcode.two;

import com.sun.tools.internal.xjc.Language;

import java.util.*;
import java.util.stream.Collectors;

public class MapTest {

    public static void main(String[] args) {


        Map<String, String> map1 = new HashMap<>();
        map1.put("Java", "20");
        map1.put("Python", "20");
        map1.put("JavaScript", "20");

        Map<String, String> map2 = new HashMap<>();
        map2.put("MySQL", "12");
        map2.put("Oracle", "12");

        Map<String, Map<String, String>> map = new HashMap<>();
        map.put("language", map1);
        map.put("database", map2);

        Collection<Map<String, String>> values = map.values();
        for (Map<String, String> value : values) {
            Set<String> strings = value.keySet();
            System.out.println(strings);
        }

        Collection<Set<String>> collect = map.values().stream().map(Map::keySet).collect(Collectors.toList());
        for (Set<String> strings : collect) {
            for (String string : strings) {
                System.out.println(string);
            }
        }

    }
}
