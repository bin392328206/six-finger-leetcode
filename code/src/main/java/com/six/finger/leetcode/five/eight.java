package com.six.finger.leetcode.five;

public class eight {


    public static void main(String[] args) {

        int[] nums={1,3,5,7};


        int i = searchInsert1(nums, 2);
        System.out.println(i);


    }


    public static int searchInsert(int[] nums, int target) {


        if (nums.length == 0 || nums == null) {
            return 0;
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;

    }


    public static int searchInsert1(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }

        int left = 0;
        int right = nums.length-1;

        while (left < right) {
          int mid = left+(right-left)/2;

          if (nums[mid]==target){
              return mid;
          }
            if (nums[mid]>target){
                right=mid;
            }else {
                left=mid+1;
            }

        }

        if (nums[left]<target){
                    return left+1;
        }else {
            return left;
        }


    }
}
