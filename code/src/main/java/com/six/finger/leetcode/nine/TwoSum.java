package com.six.finger.leetcode.nine;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {

    public static void main(String[] args) {

        Integer integer = Integer.valueOf("");
        System.out.println("11");

    }

    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> map=new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                int[] res=new int[2];
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }else {
                map.put(nums[i],i);
            }
        }
        return null;

    }
}