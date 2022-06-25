package com.six.finger.leetcode.five;

 import com.six.finger.leetcode.common.ListNode1;

public class thirdsix {
    public static void main(String[] args) {

    }

    public ListNode1 removeElements(ListNode1 head, int val) {
        if (head==null){
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }


    public ListNode1 removeElements1(ListNode1 head, int val) {
        if (head==null){
            return new ListNode1();
        }
        ListNode1 dummyHead = new ListNode1(0);
        dummyHead.next=head;

        ListNode1 temp=dummyHead;
        while (temp.next!=null){
            if (temp.next.val==val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }

        return  dummyHead.next;

    }
}
