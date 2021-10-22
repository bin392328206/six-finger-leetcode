package com.six.finger.leetcode.twenty;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/8/3 18:35
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 */
public class Search {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9};
        int target = -1;
        int search = search(nums, target);
        System.out.println(search);

    }

    public static int search(int[] nums, int target) {
        int piont;
        int left = 0, right = nums.length - 1;
        while (left <=right) {
            piont = left+ (right - left) / 2;
            if (target == nums[piont]) {
                return piont;
            }
            if (target > nums[piont]) {
                left = piont + 1;
            } else {
                right = piont-1;
            }
        }
        return -1;

    }
}
