package com.six.finger.leetcode.list;

import java.util.ArrayList;
import java.util.List;

/*
给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。

在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class Gnerate {

    public static void main(String[] args) {

        System.out.println(generate(3));

    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>>  res=new ArrayList<>();


        for (int i = 0; i < numRows; i++) {
            List<Integer> row=new ArrayList<>();

            for (int j=0;j<=i;++j){
                if (j==0|j==i){
                    row.add(1);
                }else {
                    row.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
                }
            }

            res.add(row);
        }

        return res;

    }
}
