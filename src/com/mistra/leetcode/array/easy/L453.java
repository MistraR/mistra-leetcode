package com.mistra.leetcode.array.easy;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/9 9:59 下午
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L453 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(minMoves(arr));
    }

    public static int minMoves(int[] nums) {
        int moves = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            moves += nums[i];
            min = Math.min(min, nums[i]);
        }
        return moves - min * nums.length;
    }
}
