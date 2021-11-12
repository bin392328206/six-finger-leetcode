package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode;
import com.six.finger.leetcode.common.ListNode1;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/11 14:24
 * <p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode1 node1 = new ListNode1(1);
        ListNode1 node2 = new ListNode1(2);
        ListNode1 node3 = new ListNode1(4);

        node1.next = node2;
        node2.next = node3;


        ListNode1 node4 = new ListNode1(1);
        ListNode1 node5 = new ListNode1(3);
        ListNode1 node6 = new ListNode1(4);

        node4.next = node5;
        node5.next = node6;

        mergeTwoLists(node1, node4);


    }


    /**
     * @author: xiaoliuliu
     * @Date: 2021/11/11 14:32
     * @Description: 暴力循环解法
     */
    public static ListNode1 mergeTwoLists(ListNode1 l1, ListNode1 l2) {

        ListNode1 pre = new ListNode1(-1);

        ListNode1 res = pre;

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                res.next = l2;
                l2 = l2.next;
            } else {
                res.next = l1;
                l1 = l1.next;
            }

            res = res.next;
        }

        if (l1 == null) {
            res.next = l2;
        }

        if (l2 == null) {
            res.next = l1;
        }

        return pre.next;


    }


    /**
     * @author: xiaoliuliu
     * @Date: 2021/11/11 14:32
     * @Description: 暴力循环解法
     */
    public static ListNode1 mergeTwoLists1(ListNode1 l1, ListNode1 l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }
}
