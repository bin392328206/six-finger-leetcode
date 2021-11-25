package com.six.finger.leetcode.primary.algorithms;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/25 18:20
 * <p>
 * <p>
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne {

    public static void main(String[] args) {

    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }else {

                digits[i]=0;
            }
        }
        int[] temp=new int[digits.length+1];
        temp[0]=1;

        return temp;


    }
}
