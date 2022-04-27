package com.six.finger.leetcode.twozore;

public class SearchInsert {


    public static void main(String[] args) {
        int[]  nums={1,3,5,6};

        int target=7;

        searchInsert(nums,target);
    }

    public static int searchInsert(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target){
                System.out.println(i);
                return i;
            }
        }

        return nums.length;

    }
}
