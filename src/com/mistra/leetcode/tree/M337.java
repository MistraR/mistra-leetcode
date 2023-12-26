package com.mistra.leetcode.tree;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/13
 * @ Description:
 * 小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为root。
 *
 * 除了root之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果 两个直接相连的房子在同一天晚上被打劫 ，房屋将自动报警。
 *
 * 给定二叉树的root。返回在不触动警报的情况下，小偷能够盗取的最高金额
 *
 * 隔一层偷，只需要计算2种情况的和哪个更大
 */
public class M337 {

    public int rob(TreeNode root) {
        int[] ans = recursion(root);
        return Math.max(ans[0], ans[1]);
    }

    public int[] recursion(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = recursion(root.getLeft());
        int[] right = recursion(root.getRight());
        int childSum = left[0] + right[0];//左右子节点的和
        int rootSum = left[1] + right[1] + root.getVal();//当前root的左右子节点的左右子节点的值+当前root的值 的 和
        rootSum = Math.max(childSum, rootSum);//计算当前节点的最大和，放到0的位置，当前节点的子节点的和放到1的位置
        return new int[]{rootSum, childSum};
    }
}
