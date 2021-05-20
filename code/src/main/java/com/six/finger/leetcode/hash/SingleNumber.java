package com.six.finger.leetcode.hash;

import java.util.*;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/5/19 21:11
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 输入: [2,2,1]
 * 输出: 1
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] a={2,2,3,3,5};
        int i = singleNumber1(a);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        int res=0;
            if (null!=nums&&nums.length>0){
                for(int i=0;i<nums.length;i++){
                    res=res^nums[i];
                }
            }
            return res;

    }


    public static int singleNumber1(int[] nums) {
        Map<Integer ,Integer> map=new HashMap();
        int res=0;
        for (int num : nums) {
            if (map.containsKey(num)){
                map.put(num,2);
            }else {
                map.put(num,1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            if (next.getValue()==1){
                res=next.getKey();
            }
        }
        return res;

    }

}
