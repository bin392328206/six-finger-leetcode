package com.six.finger.leetcode.five;

import com.six.finger.leetcode.common.ListNode1;

import java.util.List;


public class fourtyonw {

    public static void main(String[] args) {

    }

    public static ListNode1 removeNthFromEnd(ListNode1 head, int n) {

        int len = getLength(head);
        System.out.println(len);

        ListNode1 temp = new ListNode1(0);
        ListNode1 cur = temp;


        for (int i = 0; i <= len-n; i++) {
            cur=cur.next;
        }
        cur.next=cur.next.next;

        return temp.next;





    }

    private static int getLength(ListNode1 head) {
        int res = 0;
        while (head.next != null) {
            res++;
        }
        return res;
    }




    public static ListNode1 removeNthFromEnd1(ListNode1 head, int n) {

        ListNode1 dummy = new ListNode1(0);
        dummy.next = head;
        ListNode1 n1 = dummy;
        ListNode1 n2 = dummy;

        //先移动n2
        for (int i = 0; i <=n ; i++) {
            n2 = n2.next;
        }
        //然后再同时遍历
        while (n2!=null){
            n1=n1.next;
            n2=n2.next;
        }

        n1.next=n1.next.next;
        return  dummy.next;


    }
}
