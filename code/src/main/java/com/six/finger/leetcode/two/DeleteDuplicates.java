package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode;
import com.six.finger.leetcode.common.ListNode1;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/12 14:50
 * <p>
 * 1->1->2
 */
public class DeleteDuplicates {


    /**
     * @Description
     * @Author xiaoliuliu
     * @Date 2021/11/12 14:59
     * @Param 递归
     * @Return
     * @Exception
     */
    public ListNode1 deleteDuplicates(ListNode1 head) {


        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;

    }


    public ListNode1 deleteDuplicates1(ListNode1 head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode1 res = head;
        ListNode1 curr = res;

        while (curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        
        return res;

    }
}

