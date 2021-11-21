package com.six.finger.leetcode.primary.algorithms;

/*
给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。

输入: nums = [1,2,3,4,5,6,7], k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右轮转 1 步: [7,1,2,3,4,5,6]
向右轮转 2 步: [6,7,1,2,3,4,5]
向右轮转 3 步: [5,6,7,1,2,3,4]

作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

public class Rotate {

    public static void main(String[] args) {

        int[] s={1,2,3,4,5,6,7};
        // 99 -1 -100 3
        rotate(s,3);

    }

    public static void rotate(int[] nums, int k) {

        int[] res=new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            res[(i+k)%nums.length]=nums[i];
        }

        System.arraycopy(res, 0, nums, 0, nums.length);






    }
}
