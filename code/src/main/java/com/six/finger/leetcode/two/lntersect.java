package com.six.finger.leetcode.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/5 18:14
 * <p>
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 */
public class lntersect {

    public static void main(String[] args) {
        int[] ints={1,2,2,1};
        int[] ints2={2,2};
        intersect(ints,ints2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        if (nums1.length > nums2.length) {
            for (int i : nums1) {
                if (map.get(i) == null) {
                    map.put(i, 1);
                } else {
                    map.put(i, map.get(i) + 1);
                }
            }

            for (int i : nums2) {
                if (map.containsKey(i)) {
                    list.add(i);
                    if (map.get(i)-1==0){
                        map.remove(i);
                    }else {
                        map.put(i, map.get(i) - 1);
                    }
                }
            }
        } else {
            for (int i : nums2) {
                if (map.get(i) == null) {
                    map.put(i, 1);
                } else {
                    map.put(i, map.get(i) + 1);
                }
            }

            for (int i : nums1) {
                if (map.containsKey(i)) {
                    list.add(i);
                    if (map.get(i)-1==0){
                        map.remove(i);
                    }else {
                        map.put(i, map.get(i) - 1);
                    }
                }
            }
        }


        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }

        return ints;
    }
}
