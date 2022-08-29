package com.mistra.leetcode.array.offer;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/29 20:38
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L10 {

    public static void main(String[] args) {

    }


    public static int test(int n) {
        int[] dp = new int[n + 2];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
