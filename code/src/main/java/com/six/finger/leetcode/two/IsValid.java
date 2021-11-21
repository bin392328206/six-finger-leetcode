package com.six.finger.leetcode.two;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/15 21:03
 */
public class IsValid {

    public static void main(String[] args) {
        String s="()";
        isValid(s);
    }

    public static boolean isValid(String s) {

        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }



        Map<Character,Character> map=new HashMap<>();

        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Deque<Character> deque=new LinkedList<>();

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
           if (map.containsKey(aChar)){
               if (deque.isEmpty()||deque.peek()!=map.get(aChar)){
                   return false;
               }
               deque.pop();
           }else {
               deque.push(aChar);
           }
        }

        return deque.isEmpty();

    }
}
