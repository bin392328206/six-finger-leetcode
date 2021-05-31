package com.six.finger.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/5/27 20:44
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 */
public class FindRepeatNumber {

    public static void main(String[] args) {
        int[] s = {2, 3, 1, 0, 2, 5, 3};

        System.out.println(findRepeatNumber(s));
    }

    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                res = num;
            }
        }
        return res;
    }
}


