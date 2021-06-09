package com.six.finger.leetcode.hash;

import java.util.Arrays;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/6/8 16:19
 * 统计所有小于非负整数 n 的质数的数量。
 * 输入：n = 10
 * 输出：4
 * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class CountPrimes {


    public static int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                ans += 1;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int i = countPrimes(10);
        System.out.println(i);
    }
}
