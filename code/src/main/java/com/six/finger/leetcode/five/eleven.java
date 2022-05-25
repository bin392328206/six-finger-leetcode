package com.six.finger.leetcode.five;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6
 */

public class eleven {


    public static void main(String[] args) {
//        List<Integer> abs = new ArrayList<>();
//        abs.add(10);
//        abs.add(2);
//        abs.add(3);
//
//        Collections.sort(abs, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//
//        for (Integer ab : abs) {
//            System.out.println(ab);


//        }


        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int i = maxSubArray(nums);
        System.out.println(i);


    }

    public static int maxSubArray(int[] nums) {
        int res = nums[0];

        int temp = 0;

        for (int num : nums) {
            temp = Math.max(num, num + temp);

            res = Math.max(res, temp);
        }
        return res;

    }
}
