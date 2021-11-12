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

        if (head == null) {
            return null;
        }
        ListNode1 node1 = new ListNode1(0);
        node1.next = head;
        ListNode1 curr = node1;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return node1.next;
    }
}
