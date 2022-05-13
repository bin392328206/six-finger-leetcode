package com.six.finger.leetcode.five;

import java.util.*;

public class four {
    public boolean isValid(String s) {

        if (s.length()%2!=0){
            return false;
        }

        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('}','{');
        hashMap.put(']','[');
        hashMap.put(')','(');

        char[] chars = s.toCharArray();

        Deque<Character> stack = new ArrayDeque<>();

        for (char aChar : chars) {
            if (hashMap.containsKey(aChar)){
                if (stack.isEmpty()||hashMap.get(aChar)!=(stack.peek())){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(aChar);
            }
        }

        return stack.isEmpty();


    }
}
