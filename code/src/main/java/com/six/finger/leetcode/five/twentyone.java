package com.six.finger.leetcode.five;

/*
输入：nums = [1,2,3]
输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

import java.util.ArrayList;
import java.util.List;

public class twentyone {

    public static void main(String[] args) {

        int[] nums={1,2,3};
        List<List<Integer>> permute = permute(nums);
        System.out.println(permute);

    }


    public static List<List<Integer>> permute(int[] nums) {
        //先判断临界条件
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        //设置一个返回值
        List<List<Integer>> res = new ArrayList<>();
        //设置我们存储路径的path
        List<Integer> path = new ArrayList<>();
        //存放使用的过程
        boolean[] used = new boolean[nums.length];
        //回溯函数
        backtracking(res, path, used, nums);
        return res;
    }

    private static void backtracking(List<List<Integer>> res, List<Integer> path, boolean[] used, int[] nums) {

        //判断退出条件
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        //回溯函数
        for (int i = 0; i < nums.length; i++) {
            //先判断
            if (used[i]) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backtracking(res, path, used, nums);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
