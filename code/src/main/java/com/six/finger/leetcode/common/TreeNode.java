package com.six.finger.leetcode.common;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/5/11 14:26
 * 二叉树的公共类
 */
public class TreeNode {
    public int data;
    public TreeNode LchildNode;
    public TreeNode RchildNode;

    public TreeNode(int data) {
        super();
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLchildNode() {
        return LchildNode;
    }

    public void setLchildNode(TreeNode lchildNode) {
        LchildNode = lchildNode;
    }

    public TreeNode getRchildNode() {
        return RchildNode;
    }

    public void setRchildNode(TreeNode rchildNode) {
        RchildNode = rchildNode;
    }


}
