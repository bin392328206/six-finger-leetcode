package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode;
import com.six.finger.leetcode.common.ListNode1;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/11 20:09
 */
public class RemoveElements {

    public ListNode1 removeElements(ListNode1 head, int val) {

        ListNode1 dummyHead = new ListNode1(0);
        dummyHead.next = head;
        ListNode1 res = dummyHead;

        while (res.next != null) {
            if (res.next.val == val) {
                res.next = res.next.next;
            } else {
                res = res.next;
            }
        }
        return dummyHead.next;


    }
}
