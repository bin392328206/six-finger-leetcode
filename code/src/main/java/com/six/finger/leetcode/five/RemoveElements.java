package com.six.finger.leetcode.five;

import com.six.finger.leetcode.common.ListNode;
import com.six.finger.leetcode.common.ListNode1;

/**
 * @author 小六六
 * @version 1.0
 * @date 2022-08-04 21:34
 */
public class RemoveElements {
    public ListNode1 removeElements(ListNode1 head, int val) {


        if (head==null){
            return head;
        }

        ListNode1 dump=new ListNode1(0);
        dump.next=head;
        ListNode1 cuur=dump;

        while (cuur!=null){
            if (cuur.next.val==val){
                cuur.next=cuur.next.next;
            }else {
                cuur=cuur.next;
            }

        }

        return dump.next;


    }
}
