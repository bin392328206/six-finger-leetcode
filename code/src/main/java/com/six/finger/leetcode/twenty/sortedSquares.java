package com.six.finger.leetcode.twenty;

import java.util.Arrays;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/8/4 18:25
 *
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 *
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *
 */
public class sortedSquares {

    public static void main(String[] args) {

        int[] nums={-4,-1,0,3,10};
        sortedSquares(nums);
        for (int num : nums) {
            System.out.println(num);
        }

    }

    public static int[] sortedSquares(int[] nums) {
        int[] n=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                int pow = (int) Math.pow(nums[i], 2);
                n[i]=pow;
            }

        Arrays.sort(n);
            return n;
    }

}
