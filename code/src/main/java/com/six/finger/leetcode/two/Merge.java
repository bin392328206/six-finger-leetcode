package com.six.finger.leetcode.two;

import java.util.Arrays;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/4 21:01
 * <p>
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 */
public class Merge {


    public static void main(String[] args) {

        int[] ints1={1,2,3,0,0,0};
        int[] ints2={2,5,6};
        merge1(ints1,3,ints2,3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    /**
     * @author: xiaoliuliu
     * @Date: 2021/11/5 17:16
     * @Description: 双指针的写法
     */
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;

        int[] res = new int[m + n];
        int cur;
        while (i < m || j < n) {
            if (i == m) {
                cur = nums2[j++];
            }
            else if (n == j) {
                cur = nums1[i++];
            }
            else if (nums1[i] > nums2[j]) {
                cur = nums2[j++];
            } else {
                cur = nums1[i++];
            }
            res[i + j - 1] = cur;
        }

        for (int c = 0; c != m + n; c++) {
            nums1[c] = res[c];
        }


    }
}
