package com.six.finger.leetcode.five;

import java.util.Arrays;
import java.util.stream.IntStream;

public class twentynine {

    public static void main(String[] args) {

    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        //首排序
        Arrays.sort(nums);
        //定义一个res
        int res = 0;
        // 遍历排序后的数组，有负值且还有转换次数就转正

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0 && k > 0) {
                nums[i] = -1 * nums[i];
                k--;
            }
            res += nums[i];
        }
        // 再排序有三种情况 1. 转换次数已经用完 此时直接返回即可
        //                 2.转换次数没用完 还剩偶数次，此时没有负数了，直接返回即可
        //                 3.转换次数没用完 还剩偶数次，此时没有负数了，返回sum-2*最小数,为啥是减去2次，大家注意下，因为我们之前多加了一次
        Arrays.sort(nums);
        return res - (k % 2 == 0? 0 : 2 * nums[0]);


    }
}
