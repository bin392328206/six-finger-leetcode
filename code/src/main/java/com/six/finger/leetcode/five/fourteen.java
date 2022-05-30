package com.six.finger.leetcode.five;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class fourteen {
    public static void main(String[] args) {
        combine(4, 2);
    }


    public static List<List<Integer>> combine(int n, int k) {
        //这个是我用来放结果的
        List<List<Integer>> res = new ArrayList<>();
        //这个是用来方我们走过的路径的，这不好用List,可以用队列，因为我们要回退上一步
        LinkedList<Integer> temp = new LinkedList<>();
        backtracking(1, res, k, temp, n);
        return res;

    }

    private static void backtracking(int i, List<List<Integer>> res, int k, LinkedList<Integer> temp, int n) {
        //这是递归的结束条件
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        //这里的for循环，表示我们的深入遍历，遍历到最后，然后再一步步回溯，就是把先把每个一个向下走的路走完，再走其他的分叉
        for (int j = i; j <= n-(k-temp.size())+1; j++) {
            temp.add(j);
            backtracking(j + 1, res, k, temp, n);
            temp.removeLast();
        }
    }
}
