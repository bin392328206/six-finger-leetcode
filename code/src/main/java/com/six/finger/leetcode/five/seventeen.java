package com.six.finger.leetcode.five;

import java.util.ArrayList;
import java.util.List;


/*
   给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。

回文串 是正着读和反着读都一样的字符串。

输入：s = "aab"
输出：[["a","a","b"],["aa","b"]]
 */


public class seventeen {


    public static void main(String[] args) {

        System.out.println(partition("aab"));
        System.out.println("bb");


    }


    public static List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();

        List<String> path = new ArrayList<>();

        backtracking(res, path, s, 0);

        return res;


    }

    private static void backtracking(List<List<String>> res, List<String> path, String s, int index) {

        //结束条件
        if (index>=s.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        //回溯部分
        for (int i=index;i<s.length();i++){
            //判断是不是回文数

            if (isHuiWen(s,index,i)){
                path.add(s.substring(index,i+1));
            }else {
                continue;
            }
            backtracking(res,path,s,i+1);
            path.remove(path.size()-1);

        }

    }

    //判断是否回文
    private static boolean isHuiWen(String s, int index, int i) {
        char[] chars = s.toCharArray();

        //其实这个是我们的双指针发，就是给一个头，一个尾，我们就看看他的规则

        while (index<i){
            if (chars[index]!=chars[i]){
                return false;
            }
            index++;
            i--;
        }

        return true;


    }
}

