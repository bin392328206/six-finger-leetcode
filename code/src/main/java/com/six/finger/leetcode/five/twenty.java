package com.six.finger.leetcode.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twenty {



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

        //去重的话，一定要先排序
        Arrays.sort(nums);

        List<Integer> path = new ArrayList<>();

        //需要定义一个数组的使用情况
        boolean[] used = new boolean[nums.length];


        //回溯函数
        backtracking(res, path, nums,0,used);

        return res;

    }

    private static void backtracking(List<List<Integer>> res, List<Integer> path, int[] nums,int startIndex,boolean[] used) {
        res.add(new ArrayList<>(path));
        //回溯退出条件
        if (startIndex>=nums.length){
            return;
        }

        //横向循环的宽度就是我们的树宽，然后我们深度遍历到低，就是树深。
        for (int i = startIndex; i < nums.length; i++) {
            //就是同一层的树要去重
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
                continue;
            }

            path.add(nums[i]);
            used[i] = true;
            backtracking(res,path,nums,i+1,used);
            used[i] = false;
            path.remove(path.size()-1);
        }

    }
}
