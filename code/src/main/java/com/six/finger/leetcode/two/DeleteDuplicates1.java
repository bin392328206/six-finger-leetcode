package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode1;

public class DeleteDuplicates1 {


    public static void main(String[] args) {


    }


    public ListNode1 deleteDuplicates(ListNode1 head) {

        if (head == null||head.next==null) {
            return head;
        }

        ListNode1 dumdy=head;

        ListNode1 current= dumdy;

        while (current!=null&&current.next!=null){

            if (current.val==current.next.val){
                current.next=current.next.next;
            }
            current=current.next;

        }
        return dumdy.next;

    }
}
