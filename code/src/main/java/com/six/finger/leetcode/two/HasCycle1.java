package com.six.finger.leetcode.two;

import com.six.finger.leetcode.common.ListNode1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HasCycle1 {

    public static void main(String[] args) {
//        ListNode1 listNode1 = new ListNode1(1);
//        hasCycle(listNode1);

        HashMap<String, Object> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("sex",true);
        map.put("age",34);
        map.put("money",null);
    }

    public static boolean hasCycle(ListNode1 head) {

        Set<ListNode1> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return false;

    }


    /*
    快慢指针
     */
    public static boolean hasCycle1(ListNode1 head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode1 slow = head;
        ListNode1 fast = head.next;

        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

    }


}
