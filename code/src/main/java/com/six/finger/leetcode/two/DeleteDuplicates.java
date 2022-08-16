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
        if (null == head || null == head.next) {
            return head;
        }

        ListNode1 dumy = new ListNode1(0);
        dumy.next = head;
        ListNode1 current = dumy;

        while (current.next != null && current.next.next != null) {
            if (current.next.val == current.next.next.val) {
                int vaal = current.next.val;
                while (current.next!=null&&vaal==current.next.val){
                    current.next=current.next.next;
                }
            }else {
                current=current.next;
            }
        }

        return dumy.next;

    }
}

