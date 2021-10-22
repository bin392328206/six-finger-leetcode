package com.six.finger.leetcode.twenty;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/8/4 17:48
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *输入: nums = [1,3,5,8], target = 6
 * 输出: 2
 *
 */
public class SearchInsert {

    public static void main(String[] args) {

        int[] n={1,3,5,8};
        System.out.println(searchInsert(n,6));

    }

    public static int searchInsert(int[] nums, int target) {

        int left=0,right =nums.length-1 ,res=nums.length;

        while (left<=right){
            int mid=left+(right-left)/2;
            if (nums[mid]>=target){
                res=mid;
                right=mid-1;
            }else {
                left=mid+1;
            }
        }

        return res;

    }
}
