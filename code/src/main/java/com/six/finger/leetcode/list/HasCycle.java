package com.six.finger.leetcode.list;

import com.six.finger.leetcode.common.ListNode;

import java.util.HashSet;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/10/28 15:11
 * 给定一个链表，判断链表中是否有环。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 *
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 *
 */
public class HasCycle {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();
        if (head==null||head.next==null){
            return false;
        }
        while (head.next!=null){
            if (!nodes.add(head.next)){
                return true;
            }
            head=head.next;
        }
        return false;

    }
}
