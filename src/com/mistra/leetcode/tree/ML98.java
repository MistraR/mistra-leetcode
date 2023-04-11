package com.mistra.leetcode.tree;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/10
 * @ Description:
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 *
 * 有效 二叉搜索树定义如下：
 *
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 二叉搜索树的中序遍历一定是升序的
 */
public class ML98 {

    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.getLeft())) {// 先判断左子树是否满足条件
            return false;
        }
        if (root.getVal() <= pre) {// 当前节点小于上一个节点则不是二叉搜索树
            return false;
        } else {
            pre = root.getVal();// 满足条件则更新当前节点为pre
        }
        if (!isValidBST(root.getRight())) {// 判断右子树是否满足条件
            return false;
        }
        return true;
    }

}
