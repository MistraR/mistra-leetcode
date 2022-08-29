package com.mistra.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/28 11:17
 * @ Description: 二叉树的层序遍历
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L102 {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.poll();
        queue.add(3);
        queue.poll();
        System.out.println(queue);
        String s="434";
    }

}