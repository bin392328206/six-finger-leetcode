package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode;

public class SwapPairs {

    public static ListNode swapPairs(ListNode head) {
        return conn(head);

    }


    public  static ListNode conn(ListNode node){
        if (node==null){
            return null;
        }
        ListNode left=node;

        ListNode mid=node.next;
        if (mid==null){
            return left;
        }


        ListNode right=mid.next;

        mid.next=left;
        left.next=conn(right);
        return mid;
    }




}
