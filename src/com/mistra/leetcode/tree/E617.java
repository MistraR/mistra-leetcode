package com.mistra.leetcode.tree;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/11
 * @ Description:
 * 给你两棵二叉树： root1 和 root2 。
 *
 * 想象一下，当你将其中一棵覆盖到另一棵之上时，两棵树上的一些节点将会重叠（而另一些不会）。你需要将这两棵树合并成一棵新二叉树。
 * 合并的规则是：如果两个节点重叠，那么将这两个节点的值相加作为合并后节点的新值；否则，不为 null 的节点将直接作为新二叉树的节点。
 *
 * 返回合并后的二叉树。
 *
 * 注意: 合并过程必须从两个树的根节点开始。
 */
public class E617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return root1 == null ? root2 : root1;
        }
        return dfs(root1, root2);
    }

    public TreeNode dfs(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {// 只要有一个为null就可以返回另一个不为null的作为上层的子节点
            return root1 == null ? root2 : root1;
        }
        root1.setVal(root1.getVal() + root2.getVal());// 合并值
        root1.setLeft(dfs(root1.getLeft(), root2.getLeft()));// 求左节点
        root1.setRight(dfs(root1.getRight(), root2.getRight()));// 求右节点
        return root1;// 返回作为上层的子节点
    }
}
