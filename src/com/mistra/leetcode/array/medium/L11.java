package com.mistra.leetcode.array.medium;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 17:21
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */


public class L11 {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1, res = 0;
        while (l < r) {
            res = height[l] < height[r] ? Math.max(res, height[l++] * (r - l + 1)) : Math.max(res, height[r--] * (r - l + 1));
        }
        return res;
    }
}
