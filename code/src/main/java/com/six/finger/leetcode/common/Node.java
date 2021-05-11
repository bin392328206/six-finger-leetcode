package com.six.finger.leetcode.common;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/5/11 14:27
 *  链表的公众类
 */
public class Node {
    String data;
    Node next;

    public Node(String data) {
        super();
        this.data = data;
    }

    public Node(String data, Node next) {
        super();
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
