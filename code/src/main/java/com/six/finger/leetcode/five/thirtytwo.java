package com.six.finger.leetcode.five;

public class thirtytwo {

    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }

        }
        return left;

    }


    public int removeElement1(int[] nums, int val) {
        int right = nums.length;
        int left = 0;
        while (left<right){
            if (nums[left]==val){
                nums[left]=nums[right-1];
                right--;
            }else {
                left++;
            }
        }

        return left;


    }
}
