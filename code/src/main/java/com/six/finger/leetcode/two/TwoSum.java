package com.six.finger.leetcode.two;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/4 20:53
 */
public class TwoSum {


    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i <nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                res[0]=i;
                res[i]=map.get(target-nums[i]);
                return res;
            }else {
                map.put(target-nums[i],i);
            }
        }
        return res;


    }
}
