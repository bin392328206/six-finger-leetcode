package com.six.finger.leetcode.five;

import com.six.finger.leetcode.common.ListNode1;

public class six {


    public ListNode1 swapPairs(ListNode1 head) {

        if (head==null||head.next==null){
            return head;
        }

        ListNode1 newHead=head.next;
        head.next=swapPairs(newHead.next);
        newHead.next=head;
        return newHead;
    }
}
