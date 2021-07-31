package com.six.finger.leetcode.hash;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/6/30 17:44
 *
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 * 输入：
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 输出：3
 * 解释：
 * 长度最长的公共子数组是 [3, 2, 1] 。
 *
 */
public class FindLength {


    public static void main(String[] args) {
        int[] nums1={1,2,3,2,1};
        int[] nums2={3,2,1,4,7};
        int length = findLength(nums1, nums2);
        System.out.println(length);
    }


    public static int findLength(int[] nums1, int[] nums2) {

        if(null==nums1||nums1.length==0||null==nums2||nums2.length==0){
            return 0;
        }
        int max=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int num = 0;
                while (i+num<nums1.length&&j+num<nums2.length&&nums1[i]==nums2[j]){
                    num++;
                }
                if (max<num){
                    max=num;
                }
            }
        }
        return max;
    }


    public static int findLength1(int[] nums1, int[] nums2) {
        int n= nums1.length, m=nums2.length;
        int ret=0;

        for(int i=0;i<n;i++){
            int len=Math.min(m,n-1);
            int maxlen=maxLength(nums1,nums2,i,0,len);
        }
        for (int i=0;i<m;i++){
            int len=Math.min(n,m-1);
            int maxlen=maxLength(nums1,nums2,0,i,len);
            ret=Math.max(ret,maxlen);
        }
        return ret;
    }

    private static int maxLength(int[] nums1, int[] nums2, int i, int i1, int len) {
            int ret=0,k=0;
            for (int a=0;i<len;i++){
                if (nums1[i+a]==nums2[i1+a]){
                    k++;
                }else {
                    k=0;
                }
                ret=Math.max(ret,k);

            }
            return ret;

    }
}
