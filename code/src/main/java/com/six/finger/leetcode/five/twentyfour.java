package com.six.finger.leetcode.five;

public class twentyfour {

    public static void main(String[] args) {

    }

    public int getMax(int[] nums) {
        //定义一个返回值res
        int res = 0;


        //遍历数组
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]-nums[i-1]>0){
                res=res+nums[i]-nums[i-1];
            }

        }

        return res;

    }
}
