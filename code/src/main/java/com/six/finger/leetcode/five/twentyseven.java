package com.six.finger.leetcode.five;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个位置。
 * 示例 1:
 * <p>
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 */

public class twentyseven {

    public static void main(String[] args) {


    }

    public boolean canJump(int[] nums) {
        //数组的总长度
        int n=nums.length;
        //记录单词可以跳的最远位置
        int rightmost=0;

        for (int i = 0; i < nums.length; i++) {
            if (i<=rightmost){
                //必须<=才可以继续
                //判断最远的位置
                rightmost=Math.max(rightmost,i+nums[i]);
                if (rightmost>=n-1){
                    return true;
                }
            }
        }
        return false;
    }
}
