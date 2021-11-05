package com.six.finger.leetcode.tree;


import com.six.finger.leetcode.common.TreeNode;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/2 21:49
 */
public class IsSymmetric {

    public static void main(String[] args) {
        com.six.finger.leetcode.common.TreeNode treeNode = new com.six.finger.leetcode.common.TreeNode(3);
        com.six.finger.leetcode.common.TreeNode treeNode1 = new com.six.finger.leetcode.common.TreeNode(9);
        com.six.finger.leetcode.common.TreeNode treeNode2 = new com.six.finger.leetcode.common.TreeNode(20);
        com.six.finger.leetcode.common.TreeNode treeNode3 = new com.six.finger.leetcode.common.TreeNode(15);
        com.six.finger.leetcode.common.TreeNode treeNode4 = new com.six.finger.leetcode.common.TreeNode(7);
        treeNode.setLchildNode(treeNode1);
        treeNode.setRchildNode(treeNode2);
        treeNode2.setLchildNode(treeNode3);
        treeNode2.setRchildNode(treeNode4);


    }



    public static boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private static boolean check(TreeNode root, TreeNode root1) {

        if (null==root&&root1==null){
            return true;
        }

        if (root==null||root1==null){
            return false;
        }
        return root.data==root1.data&&check(root.LchildNode,root1.RchildNode)&&check(root.RchildNode,root1.LchildNode);
    }
}
