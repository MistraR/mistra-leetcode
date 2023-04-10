package com.mistra.leetcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/28 11:17
 * @ Description: 二叉树的层序遍历
 */
public class ML102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            int n = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode treeNode = queue.poll();
                tmp.add(treeNode.getVal());
                if (treeNode.getLeft() != null) {
                    queue.add(treeNode.getLeft());
                }
                if (treeNode.getRight() != null) {
                    queue.add(treeNode.getRight());
                }
            }
            res.add(tmp);
        }
        return res;
    }

}