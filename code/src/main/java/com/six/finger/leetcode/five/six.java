package com.six.finger.leetcode.five;

import com.six.finger.leetcode.common.ListNode;
import com.six.finger.leetcode.common.ListNode1;

import java.util.List;

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


    public ListNode1 swapPairs1(ListNode1 head) {
        ListNode1 res = new ListNode1();
        res.next=head;
        ListNode1 curr=res;

        while (curr!=null&&curr.next!=null){
            ListNode1 start=curr.next;
            ListNode1 end =curr.next.next;

            curr.next=end;
            start.next=end.next;
            end.next=start;
            curr=start;
        }
        return  res.next;
    }
}
