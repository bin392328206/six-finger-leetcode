package com.six.finger.leetcode.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/5/20 21:25
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 */
public class IsAnagram {

    public static void main(String[] args) {
        String s="anigram";
        String t="ngaram";
        boolean anagram = isAnagram3(s, t);
        System.out.println(anagram);

    }


    public static boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }


    public static boolean isAnagram1(String s, String t) {
        char[] chars1 = s.toCharArray();
        Map<Character,Integer> map=new HashMap();
        for (char c : chars1) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        char[] chars2 = t.toCharArray();
        for (char c : chars2) {
            if (!map.containsKey(c)){
                return false;
            }else {
                map.put(c,map.get(c)-1);
            }
        }
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            if (next.getValue()!=0){
                return false;
            }
        }
        return true;
    }
    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> table = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) - 1);
            if (table.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }

}
