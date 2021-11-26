package com.six.finger.leetcode.primary.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/26 18:13
 */
public class TwoSum {



    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                int[] ints = new int[2];
                ints[0]=i;
                ints[1]=map.get(target-nums[i]);
                return ints;
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
