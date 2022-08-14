package com.six.finger.leetcode.twentytwo.eight;

import java.util.ArrayList;
import java.util.List;

public class WonderfulSubstrings {

    public static void main(String[] args) {


    }

    public static long wonderfulSubstrings(String word) {
        char c = word.charAt(0);
        //先判断临界条件
        if (word.length() == 0) {
            return 0;
        }
        //设置一个返回值
        List<List<Character>> res = new ArrayList<>();
        //存走过的路径
        List<Character> path = new ArrayList<>();

        //回溯
        backtracking(word, res, path);

        return res.size();

    }

    private static void backtracking(String word, List<List<Character>> res, List<Character> path) {
        //退出条件

    }
}
