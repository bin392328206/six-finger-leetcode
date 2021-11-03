package com.six.finger.leetcode.two;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

    }


    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);

        int n= nums.length;

        for (int i = 0; i <n-1 ; i++) {
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicate1(int[] nums){
        Set<Integer> set=new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }


}
