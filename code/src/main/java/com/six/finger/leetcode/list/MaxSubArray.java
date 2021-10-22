package com.six.finger.leetcode.list;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/10/20 23:54
 * <p>
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 */
public class MaxSubArray {


    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(a));
    }


    /**
     *  @author: xiaoliuliu
     *  @Date: 2021/10/21 20:10
     *  @Description:  贪心算法（嘿嘿）
     */
    public static int maxSubArray(int[] nums) {


        int res = nums[0];
        if (nums.length == 1) {
            return res;
        }
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (index >= 0) {
                index = index + nums[i];
            } else {
                index = nums[i];
            }
            res = Math.max(res, index);

        }
        return res;
    }
}




