package com.mistra.leetcode.array.easy;

import java.util.HashSet;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 12:22
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L80 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] == nums[i]) {
                if (i - j > 1) {
                    nums[i] = 0;
                }
            } else {
                j = i;
            }
        }
        j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
        return j + 1;
    }

    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int t : nums) {
            if (i < 2 || nums[i - 2] != t) {
                nums[i++] = t;
            }
        }
        return i;
    }
}
