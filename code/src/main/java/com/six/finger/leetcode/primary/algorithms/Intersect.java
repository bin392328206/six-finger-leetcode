package com.six.finger.leetcode.primary.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
给定两个数组，编写一个函数来计算它们的交集。
输入：nums1 = [1,2,2,1], nums2 = [2,2]
输出：[2,2]

 */
public class Intersect {

    public static void main(String[] args) {

        int[]  nums1={4,9,5};
        int[]  nums2={9,4,9,8,4};
        intersect1(nums1,nums2);


    }

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map=new HashMap<>();


        List<Integer> list=new ArrayList<>();


        if (nums1.length>nums2.length){

            for (int i = 0; i < nums1.length; i++) {
                map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);

            }

            for (int i = 0; i < nums2.length; i++) {
                if (map.containsKey(nums2[i])){
                    if (map.get(nums2[i])==1){
                        map.remove(nums2[i]);
                    }else {
                        map.put(nums2[i],map.get(nums2[i])-1);
                    }
                    list.add(nums2[i]);
                }
            }
        }else {

            for (int j = 0; j < nums2.length; j++) {
                map.put(nums2[j],map.getOrDefault(nums2[j],0)+1);

            }

            for (int i = 0; i < nums1.length; i++) {
                if (map.containsKey(nums1[i])){
                    if (map.get(nums1[i])==1){
                        map.remove(nums1[i]);
                    }else {
                        map.put(nums1[i],map.get(nums1[i])-1);
                    }
                    list.add(nums1[i]);
                }
            }
        }

        int[] res= new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }

        return res;



    }



    public static int[] intersect1(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] res=new int[nums1.length>nums2.length?nums2.length:nums1.length];

        int index0=0;
        int index1=0;
        int index2=0;

        while (index1<nums1.length &&index2<nums2.length){
                if (nums1[index1]>nums2[index2]){
                    index2++;
                    continue;
                }else if (nums1[index1]<nums2[index2]){
                    index1++;
                    continue;
                }else {
                    res[index0]=nums1[index1];
                    index1++;
                    index2++;
                    index0++;
                }

        }

        int[] ints = Arrays.copyOfRange(res, 0, index0);

        return ints;
    }




}
