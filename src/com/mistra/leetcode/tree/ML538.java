package com.mistra.leetcode.tree;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/11
 * @ Description:
 *
 * 给出二叉 搜索 树的根节点，该树的节点值各不相同，请你将其转换为累加树（Greater Sum Tree），使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
 */
public class ML538 {

    int pre = 0;

    public TreeNode convertBST(TreeNode root) {
        recursion(root);
        return root;
    }

    public void recursion(TreeNode root) {
        if (root == null) {
            return;
        }
        recursion(root.getRight());
        root.setVal(root.getVal() + pre);
        pre = root.getVal();
        recursion(root.getLeft());
    }
}
