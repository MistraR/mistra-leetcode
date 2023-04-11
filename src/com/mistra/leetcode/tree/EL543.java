package com.mistra.leetcode.tree;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/11
 * @ Description:
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 */
public class EL543 {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int L = depth(root.getLeft());
        int R = depth(root.getRight());
        max = Math.max(max, L + R);
        return Math.max(L, R) + 1;
    }
}
