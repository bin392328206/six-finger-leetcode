package com.six.finger.leetcode.two;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/9 19:39
 * 383. 赎金信
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 * <p>
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
 * "fihjjjjei"
 * "hjibagacbhadfaefdjaeaebgi"
 */
public class CanConstruct {
    public static void main(String[] args) {

        String a = "aa";
        String b = "ab";
        canConstruct(a, b);

    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        Map<Character, Integer> magMap = new HashMap<>();
        for (int i = 0; i < mag.length; i++) {
            magMap.put(mag[i], magMap.getOrDefault(mag[i], 0) + 1);
        }
        boolean flag = true;
        for (int i = 0; i < ran.length; i++) {
            if (!magMap.containsKey(ran[i])) {
                flag = false;
                continue;
            }
            Integer integer = magMap.get(ran[i]);
            integer--;
            if (integer == 0) {
                magMap.remove(ran[i]);
            } else {
                magMap.put(ran[i], integer);
            }
        }
        return flag;
    }

    public static boolean canConstruct1(String ransomNote, String magazine) {
        int[] charCountA = new int[26];
        int[] charCountB = new int[26];


        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();

        for (char c : ran) {
            charCountA[c - 'a'] = charCountA[c - 'a'] + 1;
        }

        for (char c : mag) {
            charCountB[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (charCountA[i] > charCountB[i]) {
                return false;
            }
        }

        return true;


    }
}
