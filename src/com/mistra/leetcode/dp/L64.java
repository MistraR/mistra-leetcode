package com.mistra.leetcode.dp;

/**
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 *
 * @author mistra@future.com
 * @date 2023/3/10
 */
public class L64 {

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}}));
    }

    public static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = grid[0][0];
                } else if (i == 0) {
                    dp[0][j] = grid[0][j] + dp[0][j - 1];
                } else if (j == 0) {
                    dp[i][0] = grid[i][0] + dp[i - 1][0];
                } else {
                    dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }
}
