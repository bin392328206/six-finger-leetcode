package com.six.finger.leetcode.five;

import com.six.finger.leetcode.common.ListNode1;

public class thirdseven {

    public static void main(String[] args) {

    }

    public ListNode1 reverseList1(ListNode1 head) {
        //首先定一个pre节点

        ListNode1 pre=null;

        ListNode1 cur=head;

        while (cur!=null){
            //先保存当前节点之后的节点
            ListNode1 next=cur.next;
            //把当前节点反转
            cur.next=pre;
            //再把pre变了
            pre=cur;
            //不能用cur=cur.nex 因为其实这时候和后面的节点已经断了
            cur=next;

        }
        return pre;

    }

}
