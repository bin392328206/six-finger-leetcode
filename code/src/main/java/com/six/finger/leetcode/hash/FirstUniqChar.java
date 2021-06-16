package com.six.finger.leetcode.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/6/15 20:32
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 */
public class FirstUniqChar {


    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }


    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map=new HashMap();
        for (char aChar : chars) {
            if (map.containsKey(aChar)){
                map.put(aChar,map.get(aChar)+1);
            }else {
                map.put(aChar,1);
            }
        }
            for (int i=0;i<s.length();i++){
                if (map.get(s.charAt(i))==1){
                    return i;
                }
            }

            return -1;

    }
}
