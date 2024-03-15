package com.six.finger.leetcode.nine;

public class searchInsert {

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int i = searchInsert(nums, 2);
        System.out.println(i);
    }


    public  static int searchInsert(int[] nums, int target) {

        if (nums.length == 0) {
            return target;
        }

        int right = nums.length-1;

        int left = 0;
        while (left <= right) {

            int mid =left+ (right - left) / 2;

            if (target > nums[mid]) {
                left = mid+1;

            } else if (target < nums[mid]){
                right = mid-1;

            }else {
                return mid;
            }
        }

        return right+1;


    }
}
