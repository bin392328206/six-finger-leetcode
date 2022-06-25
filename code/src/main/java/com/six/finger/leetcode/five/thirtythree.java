package com.six.finger.leetcode.five;


/*

704. 二分查找
输入: nums = [-1,0,3,5,9,12], target = 9
输出: 4
解释: 9 出现在 nums 中并且下标为 4
 */

public class thirtythree {
    public static void main(String[] args) {

    }

    public int get(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);

            if (nums[mid] > target) {
                right = nums.length / 2 - 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;

    }
}