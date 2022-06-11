package com.six.finger.leetcode.five;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class eighteen {

    public static void main(String[] args) {

    }


    public List<String> restoreIpAddresses(String s) {
        //临界条件的判断
        int len = s.length();

        //定义一个结果
        List<String> res = new ArrayList<>();

        // 如果长度不够，不搜索
        if (len < 4 || len > 12) {
            return res;
        }
        // 设置存储path的子集
        Deque<String> path = new ArrayDeque<>(4);
        int splitTimes = 0;


        //就是进行我们backtracing

        backtracing(s, len, splitTimes, 0, path, res);

        //返回结果
        return res;
    }

    private void backtracing(String s, int len, int split, int begin, Deque<String> path, List<String> res) {

        //判断退出条件

        if (begin == len) {
            if (split == 4) {
                res.add(String.join(".", path));
            }
            return;
        }


        for (int i = 0; i < 3; i++) {
            if (begin + i >= len) {
                break;
            }

            int ipSegment = judgeIfIpSegment(s, begin, begin + i);
            if (ipSegment != -1) {
                // 在判断是 ip 段的情况下，才去做截取
                path.addLast(ipSegment + "");
                backtracing(s, len, split + 1, begin + i + 1, path, res);
                path.removeLast();
            }
        }



    }


    //其实这个就是把string变成int类型
    private int judgeIfIpSegment(String s, int left, int right) {
        int len = right - left + 1;

        // 大于 1 位的时候，不能以 0 开头
        if (len > 1 && s.charAt(left) == '0') {
            return -1;
        }

        // 转成 int 类型
        int res = 0;
        for (int i = left; i <= right; i++) {
            res = res * 10 + s.charAt(i) - '0';
        }

        if (res > 255) {
            return -1;
        }
        return res;
    }


}



