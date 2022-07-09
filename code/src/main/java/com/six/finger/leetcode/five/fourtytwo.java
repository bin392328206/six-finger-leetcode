package com.six.finger.leetcode.five;

import com.six.finger.leetcode.common.ListNode1;

import java.util.HashSet;

public class fourtytwo {
    public static void main(String[] args) {
        ListNode1 listNode1 = new ListNode1(8);
        ListNode1 listNode12=new ListNode1(4);
        ListNode1 listNode13=new ListNode1(8);
        listNode12.next=listNode13;

        ListNode1 intersectionNode = getIntersectionNode(listNode1, listNode12);

    }

    public static ListNode1 getIntersectionNode(ListNode1 headA, ListNode1 headB) {

        HashSet set = getSet(headA);
        while (headB != null) {
            if (set.contains(headB.val)){
                return headB;
            }
            headB=headB.next;
        }

        return null;

    }

    private static HashSet getSet(ListNode1 headA) {

        HashSet<Integer> set = new HashSet<>();

        while (headA != null) {
            set.add(headA.val);
            headA = headA.next;
        }

        return set;
    }
}
