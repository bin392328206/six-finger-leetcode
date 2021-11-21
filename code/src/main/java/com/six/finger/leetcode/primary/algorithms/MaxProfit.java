package com.six.finger.leetcode.primary.algorithms;

public class MaxProfit {

    public int maxProfit(int[] prices) {

       int profit=0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i+1]>prices[i]){
                profit=profit+prices[i+1]-prices[i];
            }
        }

        return profit;



    }
}
