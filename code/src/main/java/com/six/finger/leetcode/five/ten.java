package com.six.finger.leetcode.five;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

public class ten {

    public static void main(String[] args) {

        int[] nums={1,2,3};

        List<List<Integer>> permute = permute(nums);
        System.out.println("aa");


    }


    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();


        List<Integer> temp = new ArrayList<>();

        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, false);
        }


        backtracking(nums,res,map,temp);

        return res;


    }

    private static void backtracking(int[] nums, List<List<Integer>> res, Map<Integer, Boolean> map, List<Integer> temp) {
            if (nums.length==temp.size()){
                res.add(new ArrayList<>(temp));
            }

        for (int num : nums) {
            if (!map.get(num)){
                temp.add(num);
                map.put(num,true);

                backtracking(nums,res,map,temp);
                temp.remove(new Integer(num));
                map.put(num,false);
            }
        }




    }

}
