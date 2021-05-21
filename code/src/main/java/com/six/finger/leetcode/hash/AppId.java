package com.six.finger.leetcode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/5/21 15:46
 */
public class AppId {
    public static void main(String[] args) {
        int[] s1 = {236, 307, 162, 289, 291, 292, 320, 328, 376, 378, 382, 383, 393, 401, 402, 192, 216, 301, 316, 346, 146, 155, 159, 231, 244, 288, 298, 305, 310, 313, 336, 349, 351, 353, 359, 368, 373, 377, 380, 384, 388, 391, 392, 900, 303, 338, 339, 352, 398, 308};
        int[] s2 = {162, 192, 216, 218, 231, 239, 244, 251, 286, 288, 289, 291, 292, 301, 303, 305, 306, 307, 308, 311, 316, 319, 320, 321, 322, 328, 336, 338, 339, 346, 351, 352, 359, 369, 373, 376, 378, 382, 383, 388, 393, 394, 402, 403, 416, 900};
        Arrays.sort(s1);
        Arrays.sort(s2);
        List<Integer> list1 = new ArrayList<>(s1.length);

        for (int i : s1) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>(s2.length);
        for (int i : s2) {
            list2.add(i);
        }

        List<Integer> list3 = new ArrayList<>();
        for (Integer integer : list1) {
            list3.add(integer);
        }

        list3.retainAll(list2);
        list1.removeAll(list3);
        list2.removeAll(list3);



        System.out.println("完成");

        String result1 = list1.stream().map(x->x.toString()).collect(Collectors.joining(","));
        String result2 = list2.stream().map(x->x.toString()).collect(Collectors.joining(","));

        System.out.println(result1);
        System.out.printf(result2);

    }
}
