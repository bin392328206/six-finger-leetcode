package com.six.finger.leetcode.five;

/*
给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。

给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

输入：digits = "23"
输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */

import java.util.*;
import java.util.stream.Collectors;

public class sixteen {

    public static void main(String[] args) {

        LinkedList<String> path = new LinkedList();

        path.add("2");
        path.add("3");
        System.out.println(path.stream().collect(Collectors.joining("")).toString());

    }


    public List<String> letterCombinations(String digits) {
        //判断临界条件
        if (digits.length() == 0) {
            return new ArrayList<>();
        }


        //首先 我们定义一个容器来装 数字和字母的映射关系
        Map<Character, String> map = new HashMap();
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        //定义返回结果
        List<String> res = new LinkedList<>();




        backtracking(res, new StringBuffer(), digits, map,0);


        return res;

    }

    private void backtracking(List<String> res, StringBuffer path, String digits, Map<Character, String> map,int index) {

        //结束条件  这边我们用一个stringbuffer来当作我们的path
        if (index==digits.length()){
            res.add(path.toString());
            return;
        }
        //从输入的diguts然后让他从1开始一个个去操作
        char c = digits.charAt(index);

        String s = map.get(c);
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            //加入的是第一个
            path.append(aChar);
            backtracking(res,path,digits,map,index+1);
            //要按index去删除，删除的是最后一个哦
            path.deleteCharAt(index);
        }
    }


}
