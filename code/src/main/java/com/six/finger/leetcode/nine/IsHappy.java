package com.six.finger.leetcode.nine;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {

    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();
        while (n > 1 && !set.contains(n)) {
            set.add(n);
            n = next(n);
        }
        return n == 1;
    }


    public boolean isHappy1(int n) {

        int slow = n;
        int fast = next(n);
        while (fast != 1 && slow == fast) {
            slow = next(slow);
            fast = next(next(fast));
        }
        return fast == 1;

    }

    private int next(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            n = n / 10;
        }
        return sum;
    }
}
