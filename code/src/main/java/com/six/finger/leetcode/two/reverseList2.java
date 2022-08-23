package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode1;

public class reverseList2 {
    public static void main(String[] args) {

    }

    public ListNode1 reverseList1(ListNode1 head) {

        if (null==head){
            return head;
        }

        ListNode1 pre=null;

        ListNode1 curr=head;
        while (curr!=null){
            ListNode1 next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }

        return pre;


    }

}
