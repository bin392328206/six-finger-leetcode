package com.six.finger.leetcode.five;


/*
找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：

只使用数字1到9
每个数字 最多使用一次 
返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。
输入: k = 3, n = 7
输出: [[1,2,4]]
解释:
1 + 2 + 4 = 7
没有其他符合的组合了。
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class fifteen {


    public static void main(String[] args) {

        combinationsum(9, 45);

    }

    public static List<List<Integer>> combinationsum(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();

        LinkedList<Integer> path = new LinkedList<>();

        backtracking(res, path, k, n, 1,0);

        return res;

    }

    private static void backtracking(List<List<Integer>> res, LinkedList<Integer> path, int k, int n, int i,int sum) {


        if (sum > n) {
            return;
        }

        if (sum == n && path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        //第二步 树的横向长度，和减枝活动

        for (int j = i; j <= 9 - (k - path.size()) + 1; j++) {
            sum=sum+i;
            path.add(j);
            backtracking(res, path, k, n, j + 1,sum);
            path.removeLast();
            sum=sum-i;
        }


    }
}
