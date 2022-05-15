package com.six.finger.leetcode.five;

import java.util.Arrays;

/**
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3]
 * 解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面的元素。
 */
public class seven {


    public static void main(String[] args) {

        int[]  nums={0,1,2,2,3,0,4,2};
        int i = removeElement1(nums, 2);
        System.out.println(i);

    }

    public int removeElement(int[] nums, int val) {

        int res=0;

        for (int right=0;right<nums.length;right++){
            if (nums[right]!=val){
                nums[res]=nums[right];
                res++;
            }
        }
        nums= Arrays.copyOfRange(nums,0,res);

        return nums.length-res;

    }




    public static int removeElement1(int[] nums, int val) {


        int left =0;
        int right=nums.length-1;
        while (left<right){

            while (left<right&&nums[left]!=val){
                left++;
            }

            while (left<right&&nums[right]==val){
                right--;
            }

            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
        }

        if (nums[left]!=val){
            return left+1;
        }else {
            return left;
        }

    }
}
