package com.six.finger.leetcode.hash;

import java.util.*;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/5/19 21:42
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 */
public class Intersection {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = intersection1(nums1, nums2);
        for (int i : intersection) {
            System.out.println(i);
        }
    }

    /**
     * @Des
     * @Author 小六六
     * @Date 2021/5/20 18:27
     * @Param 暴力解法
     * @Return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet();
        for (int i : nums2) {
            set2.add(i);
        }

        List<Integer> list = new ArrayList<>();

        for (Integer integer : set1) {
            for (Integer integer1 : set2) {
                if (integer.equals(integer1)) {
                    list.add(integer);
                }
            }


        }
        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    /**
     * @Des
     * @Author 小六六
     * @Date 2021/5/20 18:27
     * 1122
     * 22
     * @Param
     * @Return 双指针
     */
    public static int[] intersection1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] res = new int[length1 + length2];

        int l1 = 0, l2 = 0, l3 = 0;
        while (l1 < length1 && l2 < length2) {

            int num1 = nums1[l1];
            int num2 = nums2[l2];

            if (num1 == num2) {
                if (l3 == 0 || num1 != res[l3 - 1]) {
                    res[l3] = num1;
                    l3++;
                }
                l1++;
                l2++;
            } else if (num1 > num2) {
                l2++;
            } else {
                l1++;
            }

        }

        return Arrays.copyOfRange(res, 0, l3);

    }
}
