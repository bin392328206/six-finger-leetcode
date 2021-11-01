package com.six.finger.leetcode.tree;

import com.six.finger.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/11/1 20:15
 * <p>
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * // 2种方式 深度遍历 和广度遍历
 */
public class MaxDepth {
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);
        treeNode.setLchildNode(treeNode1);
        treeNode.setRchildNode(treeNode2);
        treeNode2.setLchildNode(treeNode3);
        treeNode2.setRchildNode(treeNode4);

        System.out.println(maxDepth2(treeNode));


    }

    /**
     * @author: xiaoliuliu
     * @Date: 2021/11/1 20:39
     * @Description: 深度遍历
     */
    public static int maxDepth1(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int i = maxDepth1(root.LchildNode);
        int i1 = maxDepth1(root.RchildNode);
        return Math.max(i, i1) + 1;
    }


    /**
     * @author: xiaoliuliu
     * @Date: 2021/11/1 20:58
     * @Description: 广度遍历
     */
    public static int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        int res = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size > 0) {
                //出栈
                TreeNode node = queue.poll();
                if (null != node.LchildNode) {
                    queue.offer(node.LchildNode);
                }
                if (null != node.RchildNode) {
                    queue.offer(node.RchildNode);
                }
                size-=1;
            }
            res+=1;
        }
        return res;

    }

}
