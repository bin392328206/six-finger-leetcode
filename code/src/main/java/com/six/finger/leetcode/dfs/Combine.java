package com.six.finger.leetcode.dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 */

public class Combine {

    public static void main(String[] args) {

    }


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k < 0 && n < k) {
            return res;
        }

        Deque<Integer> path = new ArrayDeque<>();

        dfs(n, k, path, 1, res);
        return res;
    }

    private void dfs(int n, int k, Deque<Integer> path, int begin, List<List<Integer>> res) {
        //首先写终止递归对条件

        if (path.size() == n) {
            res.add(new ArrayList<>(path));
            return;
        }

        //遍历搜索起点

        for (int i=begin;i<=n;i++){
            path.addLast(i);

            //设置下一轮对dfs
            dfs(n,k,path,i+1,res);

            //回头操作
            path.removeLast();
        }


    }
}
