package com.six.finger.leetcode.primary.algorithms;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/26 18:04
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
    }

    public void moveZeroes(int[] nums) {
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index]=nums[i];
                index++;
            }
        }
        for (int i = index; i <nums.length ; i++) {
                nums[i]=0;
        }

    }
}
