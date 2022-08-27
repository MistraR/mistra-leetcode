package com.mistra.leetcode.array.easy;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 14:12
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L88 {
    public static void main(String[] args) {
//        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = new int[]{2, 5, 6};
//        int n = 3;
        int[] nums1 = new int[0];
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 || n == 0 || nums1.length == 0 || nums2.length == 0) {
            return;
        }
        int size = m + n;
        while (n >= 1) {
            if (nums2[n - 1] > nums1[m - 1]) {
                nums1[size - 1] = nums2[n - 1];
                n--;
            } else {
                nums1[size - 1] = nums1[m - 1];
                m--;
            }
            size--;
        }
    }
}
