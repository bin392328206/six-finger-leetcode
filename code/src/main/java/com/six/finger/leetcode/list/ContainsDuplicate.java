package com.six.finger.leetcode.list;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/10/20 15:41
 * <p>
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * 输入: [1,2,3,1]
 * 输出: true
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
