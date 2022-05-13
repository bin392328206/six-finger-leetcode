package com.six.finger.leetcode.five;

import com.six.finger.leetcode.common.ListNode1;

/*
输入：l1 = [1,2,4], l2 = [1,3,4]
输出：[1,1,2,3,4,4]
 */

public class three {

    public ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        if (list1==null){
            return list2;
        }

        if (list2==null){
            return list1;
        }

        if (list1.val>list2.val){
            list2.next=mergeTwoLists(list2.next,list1);
            return list2;
        }else {
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }

    }


    public ListNode1 mergeTwoLists1(ListNode1 list1, ListNode1 list2) {

        ListNode1 res = new ListNode1();
        ListNode1 current=res;

        while (list1!=null&&list2!=null){

            if (list1.val>list2.val){
                current.next=new ListNode1(list2.val);
            }else {
                current.next=new ListNode1(list1.val);
            }
        }

        if (list1==null){
            current.next=list2;
        }

        if (list2==null){
            current.next=list1;
        }

        return res.next;


    }
}
