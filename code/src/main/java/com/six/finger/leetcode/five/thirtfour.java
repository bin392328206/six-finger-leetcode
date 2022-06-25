package com.six.finger.leetcode.five;

import java.util.Arrays;

public class thirtfour {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] ints = sortedSquares1(nums);
        System.out.println(ints);

    }

    public  int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }


    public static int[] sortedSquares1(int[] nums) {
        int[] ans = new int[nums.length];
        int len=nums.length;
        for (int i = 0,j=len-1,pos=len-1; i <=j; ) {
            if (nums[i]*nums[i]>nums[j]*nums[j]){
                ans[pos] = nums[i] * nums[i];
                ++i;
            }else {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
            
        }
        return ans;
    }
}
