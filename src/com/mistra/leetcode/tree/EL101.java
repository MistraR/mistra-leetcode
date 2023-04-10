package com.mistra.leetcode.tree;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/10
 * @ Description:给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class EL101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return recursion(root.getLeft(), root.getRight());

    }

    public boolean recursion(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.getVal() != right.getVal()) {
            return false;
        }
        return recursion(left.getLeft(), right.getRight()) && recursion(left.getRight(), right.getLeft());
    }
}
