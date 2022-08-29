package com.mistra.leetcode.array.easy;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/29 20:42
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L1358 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4, 2, 3};
        int[] arr2 = new int[]{-4, -3, 6, 10, 20, 30};
    }

    public static int test(int[] arr1, int[] arr2, int d) {
        int res = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}
