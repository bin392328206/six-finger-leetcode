package com.six.finger.leetcode.five;


/*
给定一个整数数组 prices，其中 prices[i]表示第 i 天的股票价格 ；整数 fee 代表了交易股票的手续费用。

你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。

返回获得利润的最大值。

注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。

输入：prices = [1, 3, 2, 8, 4, 9], fee = 2
输出：8
解释：能够达到的最大利润:
在此处买入 prices[0] = 1
在此处卖出 prices[3] = 8
在此处买入 prices[4] = 4
在此处卖出 prices[5] = 9
总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8


输入： prices = [1,3,7,5,10,3], fee = 3
输出： 6

 */

public class twentyfive {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices, int fee) {

        //定义一个res

        int res = 0;
        //记录最低价格
        int min = prices[0];


        for (int i = 1; i < prices.length; i++) {
            // 记录最小值，相当于买入

            if (prices[i] < min) {
                min = prices[i];
            }

            // 就是中间状态，不需要买，也不需要卖
            if (prices[i]>=min&&prices[i]<min+fee){
                continue;
            }
            //算利润
            if(prices[i]>min+fee){
                res+=prices[i]-min-fee;
                min=prices[i]-fee;
            }
        }

        return res;




    }
}
