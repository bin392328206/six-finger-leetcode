package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode1;

public class Partition {


    public ListNode1 partition(ListNode1 head, int x) {

        ListNode1 first = new ListNode1(0);

        ListNode1 firstHead = first;

        ListNode1 last = new ListNode1(0);
        ListNode1 lastHead = last;

        while (head != null) {
            if (head.val >= x) {
                last.next = head;
                last = last.next;
            } else {

                first.next = head;
                first = first.next;
            }
            head = head.next;
        }
        last.next = null;
        first.next = lastHead.next;

        return firstHead.next;

    }
}
