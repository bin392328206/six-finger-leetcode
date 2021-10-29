package com.six.finger.leetcode.list;

import com.six.finger.leetcode.common.ListNode;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/10/29 17:41
 */
public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode listNode = new ListNode("1");
        ListNode listNode1 = new ListNode("2");
        ListNode listNode2 = new ListNode("4");
        listNode1.setNext(listNode2);
        listNode.setNext(listNode1);

        ListNode listNode3 = new ListNode("1");
        ListNode listNode4 = new ListNode("3");
        ListNode listNode5 = new ListNode("4");
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode5);

        ListNode listNode6 = mergeTwoLists(listNode, listNode3);

        System.out.println(listNode6);


    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2==null){
            return l1;
        }
        if (l1==null){
            return l2;
        }

        if (Long.valueOf(l1.data)>Long.valueOf(l2.data)){
            l2.next=mergeTwoLists(l2.next,l1);
            return l2;
        }else {
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }


    }
}
