package com.mistra.leetcode.tree;

import java.util.HashMap;

import com.mistra.leetcode.common.TreeNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/12
 * @ Description:
 *
 * 给定两个整数数组preorder 和 inorder，其中preorder 是二叉树的先序遍历， inorder是同一棵树的中序遍历，请构造二叉树并返回其根节点。
 */
public class ML105 {
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);//记录中序遍历的节点的下标
        }
        return buildTree(preorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    /**
     * 前序遍历的第一个节点就是根节点
     * 通过根节点去中序遍历的数组里确定左右边界
     */
    private TreeNode buildTree(int[] preorder, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        int rootVal = preorder[preLeft];
        TreeNode root = new TreeNode(rootVal);
        Integer inIndex = map.get(rootVal);//  找到root在中序遍历中的位置
        int number = inIndex - inLeft;//计算左节点的节点数

        root.setLeft(buildTree(preorder,
                preLeft + 1, // 左子树的前序遍历开始位置，是从第二个节点开始
                preLeft + number,// 左子树的前序遍历结束位置，是开始位置加上左子树的节点数量
                inLeft,// 左子树的中序遍历开始位置 = root的中序遍历的开始位置；
                inIndex - 1));// 左子树的中序遍历结束位置 = 中序遍历中root节点的-1位置
        root.setRight(buildTree(preorder,
                preLeft + 1 + number,// 右子树的前序遍历开始位置，就是root前序遍历的左子树的下一个
                preRight,// 右子树的前序遍历结束位置 = root的前序遍历结束位置
                inIndex + 1,// 右子树的中序遍历开始位置 = 中序遍历中root节点的下一个
                inRight));// 右子树的中序遍历结束位置 = root 中序遍历的结束位置
        return root;
    }

}
