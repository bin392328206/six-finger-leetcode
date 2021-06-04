package com.six.finger.leetcode.hash;

import java.util.*;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/6/4 17:44
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 */
public class Intersect {

    public static void main(String[] args) {
            int[] nums1={1,2,2,1};
            int[] nums2={2,2};
               intersect(nums1,nums2);

        }


    public static int[] intersect(int[] nums1, int[] nums2) {

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

}
