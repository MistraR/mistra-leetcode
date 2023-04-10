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
public class ML102L103L107 {

    /**
     * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）
     * 输入：root = [3,9,20,null,null,15,7]
     * 输出：[[3],[9,20],[15,7]]
     */
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

    /**
     * 给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）
     * 输入：root = [3,9,20,null,null,15,7]
     * 输出：[[3],[20,9],[15,7]]
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean reverse = true;
        while (queue.size() > 0) {
            int n = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode treeNode = queue.poll();
                if (reverse) {
                    tmp.add(treeNode.getVal());
                } else {
                    tmp.add(0, treeNode.getVal());
                }
                if (treeNode.getLeft() != null) {
                    queue.add(treeNode.getLeft());
                }
                if (treeNode.getRight() != null) {
                    queue.add(treeNode.getRight());
                }
            }
            reverse = !reverse;
            res.add(tmp);
        }
        return res;
    }


    /**
     * 给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
     * 输入：root = [3,9,20,null,null,15,7]
     * 输出：[[15,7],[9,20],[3]]
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
            res.add(0, tmp);
        }
        return res;
    }

}