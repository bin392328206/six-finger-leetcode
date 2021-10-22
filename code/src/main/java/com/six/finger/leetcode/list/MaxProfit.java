package com.six.finger.leetcode.list;

/*
输入：[7,1,5,3,6,4]
输出：5
解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
*/

public class MaxProfit {

    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        maxProfit1(a);
    }

    //超时
    public static int maxProfit(int[] prices) {

        if (prices.length<=1){
            return 0;
        }

        int max=0;

        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j]-prices[i]>max){
                    max=prices[j]-prices[i];
                }
            }

        }

        return max;

    }


    public static int maxProfit1(int[] prices) {
        if (prices.length<=1){
            return 0;
        }

        int min =Integer.MAX_VALUE;

        int maxProfit=0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<min){
                min=prices[i];
            }else if (prices[i]-min>maxProfit){
                maxProfit=prices[i]-min;
            }
        }
        return maxProfit;
    }

}
