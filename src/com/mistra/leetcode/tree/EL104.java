package com.mistra.leetcode.tree;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/10
 * @ Description:给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */
public class EL104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.getLeft() == null) {
            return maxDepth(root.getRight()) + 1;
        } else if (root.getRight() == null) {
            return maxDepth(root.getLeft()) + 1;
        } else {
            return Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight())) + 1;
        }
    }
}
