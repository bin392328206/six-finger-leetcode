package com.six.finger.leetcode.two;

public class MaxProfit {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {

        if (prices.length<1){
            return 0;
        }
        int max=Integer.MAX_VALUE;
        int res=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<max){
                max=prices[i];

            }else {
              res=  Math.max(res,prices[i]-max);
            }
        }

        return res;


    }
}
