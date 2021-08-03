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
        int[] nums1={3,2,1,5,7};
        int[] nums2={3,2,1,5,7};
        int length = findLength2(nums1, nums2);
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


    public static int findLength1(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int ret = 0;
        for (int i = 0; i < n; i++) {
            int len = Math.min(m, n - i);
            int maxlen = maxLength(A, B, i, 0, len);
            ret = Math.max(ret, maxlen);
        }
        for (int i = 0; i < m; i++) {
            int len = Math.min(n, m - i);
            int maxlen = maxLength(A, B, 0, i, len);
            ret = Math.max(ret, maxlen);
        }
        return ret;

    }

    private static int maxLength(int[] nums1, int[] nums2, int i, int i1, int len) {
            int ret=0,k=0;
            for (int a=0;a<len;a++){
                if (nums1[i+a]==nums2[i1+a]){
                    k++;
                }else {
                    k=0;
                }
                ret=Math.max(ret,k);

            }
            return ret;

    }



    public static int findLength2(int[] A, int[] B) {
            if (A.length<1||B.length<1){
                return -1;
            }
            int a=A.length,b=B.length;
            int ret=0;
            for (int i=0;i<a;i++){
                int min = Math.min(a, b - i);
                int i1 = maxLength1(A, B, i, 0, min);
                ret=Math.max(ret,i1);
            }

            for (int i=0;i<b;i++){
                int min=Math.min(b,a-i);
                int i1=maxLength1(A,B,0,i,min);
                ret=Math.max(ret,i1);
            }

            return ret;


    }

    private static int maxLength1(int[] A, int[] B, int a, int b, int len) {
        int ret=0,k=0;
        for (int i=0;i<len;i++){
            if (A[i+a]==B[i+b]){
                k++;
            }else {
                k=0;
            }

            ret=Math.max(ret,k);
        }

        return ret;
    }
}
