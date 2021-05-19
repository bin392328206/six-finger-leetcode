package com.six.finger.leetcode.hash;

import com.six.finger.leetcode.common.BinaryTreeNode;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小六六
 * @version 1.0
 * @date 2021/5/17 21:25
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 *  中序遍历 就是 先打印树的左节点，然后打印树的值，再打印树的右节点
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(BinaryTreeNode root) {
                List<Integer> res=new ArrayList<>();
                dfs(root,res);
                return res;
    }

    private void dfs(BinaryTreeNode root, List<Integer> res) {
            if (null==root){
                return;
            }
            dfs(root.getLchildNode(),res);
            res.add(root.getData());
            dfs(root.getRchildNode(),res);
    }

    public List<Integer> inorderTraversal1(BinaryTreeNode root) {
        List<Integer> res=new ArrayList<>();
        BinaryTreeNode pre = null;
        while (root.LchildNode!=null){
            if (root.LchildNode!=null){
                pre=root.getLchildNode();
                while (pre.RchildNode!=null){
                    pre = pre.getRchildNode();
                }
                pre.RchildNode = root;
                BinaryTreeNode tmp = root;
                root = root.LchildNode;
                tmp.LchildNode = null;
            }else {
                res.add(root.data);
                root = root.RchildNode;
            }
        }
         return  res;
    }





}
