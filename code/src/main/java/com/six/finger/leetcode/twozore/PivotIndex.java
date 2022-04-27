package com.six.finger.leetcode.twozore;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PivotIndex {


    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};
        pivotIndex(nums);


    }


    public static int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();

        int sum = 0;

        for (int i=0;i<nums.length;i++){

            if (nums[i]+2*sum==total){
                return i;
            }
            sum=sum+nums[i];
        }
        return -1;


    }
}
