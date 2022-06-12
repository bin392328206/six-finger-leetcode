package com.six.finger.leetcode.five;

import java.util.Map;

/*
输入：[7,1,5,3,6,4]
输出：5
解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。

 */
public class twentythree {
    public static void main(String[] args) {

    }

    public int max(int[] nums) {
        //定义一个最小的数
        int min = Integer.MAX_VALUE;
        //定义返回的最小值
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<min){
                //找到全部最小的值
                min = nums[i];
            }else if (nums[i]-min>res){
                res=nums[i]-min;
            }


        }

        return res;

    }
}
