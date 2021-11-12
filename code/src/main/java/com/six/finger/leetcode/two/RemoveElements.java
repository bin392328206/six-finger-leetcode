package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode;
import com.six.finger.leetcode.common.ListNode1;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/11 20:09
 *
 *
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 *
 * 总结下：递归和迭代的一些区别吧
 *
 * 递归的话就是 我们得用虚拟节点去记住之前的节点，递归的话，就是在返回的时候就可以知道了。
 *
 *
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



    /**
     *  @author: xiaoliuliu
     *  @Date: 2021/11/12 14:40
     *  @Description: 递归
     */
    public ListNode1 removeElements1(ListNode1 head, int val) {

        if (head==null){
            return null;
        }
        head.next=removeElements1(head.next,val);
        return head.val==val?head.next:head;


    }
}
