package com.six.finger.leetcode.five;


/*
输入：nums = [1,2,3]
输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */

import java.util.ArrayList;
import java.util.List;

public class nineteen {

    public static void main(String[] args) {

        List<List<Integer>> subsets = subsets(new int[]{1, 2, 3});
        System.out.println(subsets);


    }

    public static List<List<Integer>> subsets(int[] nums) {
        //设置res
        List<List<Integer>> res = new ArrayList<>();

        if (nums.length == 0) {
            return res;
        }

        //设置path

        List<Integer> path = new ArrayList<>();

        //回溯函数
        backtracking(res, path, nums,0);

        return res;

    }

    private static void backtracking(List<List<Integer>> res, List<Integer> path, int[] nums,int startIndex) {
        res.add(new ArrayList<>(path));
        //回溯退出条件
        if (startIndex>=nums.length){
            return;
        }

        //横向循环的宽度就是我们的树宽，然后我们深度遍历到低，就是树深。
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(res,path,nums,i+1);
            path.remove(path.size()-1);
        }

    }

}
