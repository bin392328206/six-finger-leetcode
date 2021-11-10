package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/10 21:13
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();
        if (head == null || head.next == null) {
            return false;
        }
        while (head.next != null) {
            if (!set.add(head.next)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
