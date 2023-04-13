package com.mistra.leetcode.tree;

import java.util.HashMap;

/**
 * @author rui.wang
 * @ Version: 1.0
 * @ Time: 2023/4/11 17:33
 * @ Description:给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数
 *
 * 动态规划
 * 递归
 */
public class M96 {

    HashMap<Integer, Integer> map = new HashMap<>();

    /**
     * 递归解法
     *
     * 对于数组中的每一个元素，都有可能成为二叉树最顶部的root节点
     * 假设 n 个节点存在二叉排序树的个数是 G (n)，令 f(i) 为以 i 为根的二叉搜索树的个数，则
     * G(n)=f(1)+f(2)+f(3)+f(4)+...+f(n)
     */
    public int numTrees(int n) {
        if (n <= 1) {
            return 1;
        }
        if (map.containsKey(n)) {// 记忆化搜索 提升时间
            return map.get(n);
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {// 以值i（注意不是下标）当做根节点，其左边有i-1个节点，右边有n-i个节点
            int leftNum = numTrees(i - 1);
            int rightNum = numTrees(n - i);
            count += leftNum * rightNum;// G(n)=f(1)+f(2)+f(3)+f(4)+...+f(n)
        }
        map.put(n, count);
        return count;
    }

    /**
     * 动态规划
     */
    public int numTrees2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++)
            for (int j = 1; j < i + 1; j++)
                dp[i] += dp[j - 1] * dp[i - j];

        return dp[n];
    }

}
