package com.six.finger.leetcode.five;

import com.six.finger.leetcode.common.ListNode1;

import java.util.List;

public class thirdeigth {

    public static void main(String[] args) {

    }

    public ListNode1 swapPairs(ListNode1 head) {

        ListNode1 dum = new ListNode1(0);
        dum.next = head;
        ListNode1 curr = dum;
        while (curr.next != null && curr.next.next != null) {
            ListNode1 node1 = curr.next;
            ListNode1 node2 = curr.next.next;
            curr.next=node2;
            node1.next=node2.next;
            node2.next=node1;
            curr=node1;
        }

        return dum.next;


    }
}
