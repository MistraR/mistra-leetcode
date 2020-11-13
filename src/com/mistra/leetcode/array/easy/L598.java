package com.mistra.leetcode.array.easy;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/13 10:56 下午
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L598 {

    public static void main(String[] args) {
        System.out.println(maxCount(3, 3, new int[][]{{2, 2}, {3, 3}}));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        if (m == 0 || n == 0 ) {
            return 0;
        }
        for (int[] op : ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m * n;
    }

}
