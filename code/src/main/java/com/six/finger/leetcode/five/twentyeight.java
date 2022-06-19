package com.six.finger.leetcode.five;

import java.util.ArrayList;
import java.util.Arrays;

public class twentyeight {
    public static void main(String[] args) {

    }

    public int findContentChildren(int[] g, int[] s) {

        //排序
        Arrays.sort(g);
        Arrays.sort(s);

        int start = s.length - 1;

        int count = 0;

        for (int i = g.length - 1; i >= 0; i--) {
            //尽量让大大胃口吃饱
            if (start >= 0 && g[i] <= s[start]) {
                start--;
                count++;
            }

        }

        return count;


    }
}
