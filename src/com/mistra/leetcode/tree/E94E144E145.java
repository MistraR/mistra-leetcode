package com.mistra.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/10
 * @ Description:给定一个二叉树的根节点 root ，返回 它的 前、中、后序 遍历，
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 *
 * ML102 层序遍历
 */
public class E94E144E145 {

    /**
     * 前序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderRecursion(root, res);
        return res;
    }

    public void preorderRecursion(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.getVal());
            preorderRecursion(root.getLeft(), res);
            preorderRecursion(root.getRight(), res);
        }
    }

    /**
     * 中序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderRecursion(root, res);
        return res;
    }

    public void inorderRecursion(TreeNode root, List<Integer> res) {
        if (root != null) {
            inorderRecursion(root.getLeft(), res);
            res.add(root.getVal());
            inorderRecursion(root.getRight(), res);
        }
    }

    /**
     * 后序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderRecursion(root, res);
        return res;
    }

    public void postorderRecursion(TreeNode root, List<Integer> res) {
        if (root != null) {
            postorderRecursion(root.getLeft(), res);
            postorderRecursion(root.getRight(), res);
            res.add(root.getVal());
        }
    }
}
