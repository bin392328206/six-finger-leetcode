package com.six.finger.leetcode.primary.algorithms;

import java.util.Locale;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/12/13 21:34
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 */
public class IsPalindrome {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        if (s.length()==0){
            return true;
        }

        s=s.toLowerCase();

        for (int i =0,j=s.length()-1; i <j ; i++,j--) {
            while (i<j&&!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while (i<j&&!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }

}
