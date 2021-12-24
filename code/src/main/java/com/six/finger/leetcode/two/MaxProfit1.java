package com.six.finger.leetcode.two;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/12/24 18:34
 * 输入: prices = [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class MaxProfit1 {


    public static void main(String[] args) {

    }


    public int maxProfit(int[] prices) {

        int res=0;
        for(int i=1;i<prices.length;i++){
            if (prices[i]-prices[i-1]>0){
                res=res+(prices[i]-prices[i-1]);
            }
        }

        return res;

    }
}
