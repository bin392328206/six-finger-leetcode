package com.six.finger.leetcode.two;

import java.util.Arrays;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/4 21:01
 *
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 *
 */
public class Merge {


    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[i+m]=nums2[i];
        }
        Arrays.sort(nums1);
    }

    public void  merge1(int[] nums1, int m, int[] nums2, int n){

        
    }
}
