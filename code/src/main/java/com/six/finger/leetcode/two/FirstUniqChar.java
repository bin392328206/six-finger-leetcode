package com.six.finger.leetcode.two;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {

    public int firstUniqChar(String s) {

        if (null==s||s.length()==0){
            return -1;
        }
        char[] chars = s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }

        for (int j = 0; j < s.length(); j++) {
            if (map.get(s.charAt(j))==1){
                return j;
            }

        }
        return -1;


    }
}
