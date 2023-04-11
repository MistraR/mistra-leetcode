package com.mistra.leetcode.tree;

import java.util.List;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/11
 * @ Description:
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 *
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 */
public class ML114 {

    TreeNode pre = null;

    public void flatten(TreeNode root) {
        preorderRecursion(root);
    }

    public void preorderRecursion(TreeNode root) {
        if (root == null) {
            return;
        }
        preorderRecursion(root.getRight());
        preorderRecursion(root.getLeft());
        root.setLeft(null);
        root.setRight(pre);
        pre = root;
    }

}
