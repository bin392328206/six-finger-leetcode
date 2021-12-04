package com.six.finger.leetcode.primary.algorithms;

public class Reverse1 {

    public int reverse(int x) {

        long result=0;
        while (Math.abs(x)>0){
            result=result*10+x%10;

            x=x/10;
        }


        return (int) result==result?(int)result:0;

    }

}
