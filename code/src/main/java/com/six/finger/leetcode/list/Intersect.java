package com.six.finger.leetcode.list;

/*
给定两个数组，编写一个函数来计算它们的交集。
输入：nums1 = [1,2,2,1], nums2 = [2,2]
输出：[2,2]

 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class  Intersect {


    public static void main(String[] args) {

        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(intersect(nums1, nums2));


    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();

        for (int i : nums1) {
            if (map.get(i)==null){
            map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }


        int[] a=new int[nums1.length];

        int index=0;

        for (int i : nums2) {
            int orDefault = map.getOrDefault(i, 0);
            if (orDefault>0){
                a[index++]=i;
                orDefault--;
                if (orDefault>0){
                    map.put(i,orDefault);
                }else {
                    map.remove(i);
                }
            }

        }

        return Arrays.copyOfRange(a,0,index);


        }

    }
