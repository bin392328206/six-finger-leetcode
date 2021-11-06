package com.six.finger.leetcode.two;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * <p>
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */

public class Generate {

    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                ArrayList<Integer> integers = new ArrayList<>();

                if (i == 0 || i == j) {
                    integers.add(1);
                } else {
                    integers.add(lists.get(i - 1).get(j) + lists.get(i - 1).get(j - 1));
                }
                lists.add(integers);

            }



        }
        return lists;
    }


}
