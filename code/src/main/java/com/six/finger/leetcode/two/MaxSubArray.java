package com.six.finger.leetcode.two;

public class MaxSubArray {

    public static void main(String[] args) {

    }

    public static  int maxSubArray(int[] nums) {
        int pre=0;
        int max=nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            pre=Math.max(nums[i],pre+nums[i]);
            max=Math.max(pre,max);
        }
        return max;
    }


    public static  int maxSubArra1y(int[] nums) {
        int res = nums[0];
        int max = 0;
        for (int num : nums) {
            if (num + max > num) {
                max = num + max;
            } else {
                max = num;
            }
            res = Math.max(max, res);
        }
        return res;


    }
}
