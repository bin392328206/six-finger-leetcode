package com.six.finger.leetcode.hash;


import java.util.HashSet;
import java.util.Set;

/**
 * 「快乐数」定义为：
 *
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 true ；不是，则返回 false 。
 *
 */
public class IsHappy {


    public static void main(String[] args) {
        boolean happy = isHappy(19);
        System.out.println(happy);

    }

    public static boolean isHappy(int n) {
        Set set=new HashSet();
        while (n!=1&&!set.contains(n)){
            set.add(n);
            n=getNext(n);

        }
        return n==1;
    }

    private static int getNext(int n) {
            int all=0;
            while (n>0){
                int d=n%10;
                n=n/10;
                all+=d*d;

            }
            return all;

    }
}
