package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode1;

public class reverseBetween {

    public static void main(String[] args) {
        ListNode1 head=new ListNode1(1);
        ListNode1 listNode1=new ListNode1(2);
        head.next=listNode1;
        ListNode1 listNode2=new ListNode1(3);
        listNode1.next=listNode2;
        ListNode1 listNode3=new ListNode1(4);
        listNode2.next=listNode3;

        ListNode1 listNode11 = reverseBetween(head, 2, 3);


    }

    public static ListNode1 reverseBetween(ListNode1 head, int left, int right) {

        ListNode1 dumy= new ListNode1(0);

        dumy.next = head;
        ListNode1 pre=dumy;

        // 第 1 步：从虚拟头节点走 left - 1 步，来到 left 节点的前一个节点
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        // 第 2 步：从 pre 再走 right - left + 1 步，来到 right 节点 此时pre截断了，所以并不会往下走了
        ListNode1 rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }


        // 第 3 步：切断出一个子链表（截取链表）
        ListNode1 leftNode = pre.next;
        ListNode1 curr = rightNode.next;

        // 注意：切断链接
        pre.next = null;
        rightNode.next = null;



        // 第 4 步：同第 206 题，反转链表的子区间
        reverseLinkedList(leftNode);


        // 第 5 步：接回到原来的链表中
        pre.next = rightNode;
        leftNode.next = curr;
        return dumy.next;








    }


    private static void reverseLinkedList(ListNode1 head) {
        // 也可以使用递归反转一个链表
        ListNode1 pre = null;
        ListNode1 cur = head;

        while (cur != null) {
            ListNode1 next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

}
