package com.six.finger.leetcode.hash;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/6/7 19:47
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 *
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 *
 * 注意:
 * 假设字符串的长度不会超过 1010。
 *
 * 输入:
 * "abccccdd"
 *
 * 输出:
 * 7
 *
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 *

 */
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ssssssafaf"));
    }


    public static int longestPalindrome(String s) {
            int[] count=  new int[128];
            for(int i=0;i<s.length();++i){
                char c = s.charAt(i);
                count[c]++;
            }
        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
     }




}
