package com.mistra.leetcode.tree;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/13
 * @ Description: 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
 */
public class M236 {

    /**
     * 从上往下找
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.getVal() == p.getVal() || root.getVal() == q.getVal()) {
            return root;// 假如其中一个就是父节点，最近公共祖先就是该父节点
        }
        TreeNode left = lowestCommonAncestor(root.getLeft(), p, q);
        TreeNode right = lowestCommonAncestor(root.getRight(), p, q);
        if (left != null && right != null) {
            return root;
        } else if (left == null) {
            return right;
        } else {
            return left;
        }
    }
}
