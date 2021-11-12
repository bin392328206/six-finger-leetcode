package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode;
import com.six.finger.leetcode.common.ListNode1;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/11 20:36
 */
public class ReverseList {

    public static void main(String[] args) {
        ListNode1 listNode1 = new ListNode1(1);
        ListNode1 listNode2 = new ListNode1(2);
        ListNode1 listNode3 = new ListNode1(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
reverseList(listNode1);

    }

    public ListNode1 reverseList1(ListNode1 head) {

        ListNode1 pre=null;

        ListNode1 curr=head;
        while (curr!=null){
            //先保存后面的节点
            ListNode1 next = curr.next;
            //交互 把curr变成 1->null
            curr.next=pre;
            //再把 1-> null 保存到外面的pre上
            pre=curr;
            curr=next;
        }
        return pre;
    }


    public static   ListNode1 reverseList(ListNode1 head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode1 newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}

