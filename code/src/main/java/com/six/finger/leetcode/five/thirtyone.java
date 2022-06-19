package com.six.finger.leetcode.five;

public class thirtyone {

    public static void main(String[] args) {

    }

    public boolean lemonadeChange(int[] bills) {
        //不等于5就直接返回，因为第一个必须5
        if (bills[0] != 5) {
            return false;
        }
        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                five--;
                ten++;
            } else {
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
            }
            if (five < 0 || ten < 0) return false;

        }

        return true;

    }
}
