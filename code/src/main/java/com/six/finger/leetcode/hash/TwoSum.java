package com.six.finger.leetcode.hash;


import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;

        int[] ints = twoSum(nums, target);

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        if (null == nums | nums.length == 0) {
            return null;
        }

        Map map=new HashMap();
        int[] ints = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second=target-first;
            if (map.containsKey(second)){
                int j = (int) map.get(second);
                ints[0]=i;
                ints[1]=j;
                return ints;
            }else {
                map.put(first,i);
            }
        }


        return ints;

    }
}
