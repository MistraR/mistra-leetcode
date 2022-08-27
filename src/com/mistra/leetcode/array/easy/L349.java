package com.mistra.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 15:53
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L349 {

    public static void main(String[] args) {
        int[] intersection1 = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        int[] intersection2 = intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        System.out.println(Arrays.toString(intersection1));
        System.out.println(Arrays.toString(intersection2));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] res = new int[nums1.length];
        int i = 0, j = 0, h = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (h > 0) {
                    if (res[h - 1] != nums1[i]) {
                        res[h++] = nums1[i];
                    }
                } else {
                    res[h++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOfRange(res, 0, h);
    }

}
