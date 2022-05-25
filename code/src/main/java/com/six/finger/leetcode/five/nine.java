package com.six.finger.leetcode.five;


/*

给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。

字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。

输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
输出: [["bat"],["nat","tan"],["ate","eat","tea"]]

 */

import java.util.*;

public class nine {

    public static void main(String[] args) {


    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if (res.containsKey(s)) {
                List<String> strings = res.get(s);
                strings.add(str);
                res.put(s, strings);
            } else {
                List<String> strings = new ArrayList<>();
                strings.add(str);
                res.put(s, strings);
            }

        }
        List<List<String>> res1 = new ArrayList<>(res.values());
        return res1;
    }
}
