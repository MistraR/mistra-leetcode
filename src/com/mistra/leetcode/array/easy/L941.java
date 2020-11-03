package com.mistra.leetcode.array.easy;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/3 10:52 下午
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L941 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 6, 9, 5, 4, 0};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] A) {
        int length = A.length;
        int i = 0;
        while (i + 1 < length && A[i] < A[i + 1]) {
            i++;
        }
        if (i == 0 || i == length - 1) {
            return false;
        }
        while (i + 1 < length && A[i] > A[i + 1]) {
            i++;
        }
        return i == length - 1;
    }
}
