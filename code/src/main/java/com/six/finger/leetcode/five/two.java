package com.six.finger.leetcode.five;

/*
输入：l1 = [2,4,3], l2 = [5,6,4]
输出：[7,0,8]
解释：342 + 465 = 807.
 */

import com.six.finger.leetcode.common.ListNode;
import com.six.finger.leetcode.common.ListNode1;

public class two {


    public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {

        ListNode1 res=new ListNode1(0);

         ListNode1 curry=res;

         int  carry=0;

         while (l1.next!=null||l2.next!=null){
             int x=l1==null?0:l1.val;
             int y=l2==null?0:l2.val;

             int sum =x+y+carry;

             carry=sum/10;

             sum=sum%10;

             curry.next=new ListNode1(sum);
             curry=curry.next;

             if (l1!=null){
                 l1=l1.next;
             }


             if (l2!=null){
                 l2=l2.next;
             }
         }

         if (carry==1){
             curry.next=new ListNode1(carry);
         }


         return res.next;


    }

}
