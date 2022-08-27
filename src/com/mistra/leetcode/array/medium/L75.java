package com.mistra.leetcode.array.medium;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 13:05
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L75 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(arr);
    }

    public static void sortColors(int[] nums) {
        int zero = -1;
        int two = nums.length;
        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                int tmp = nums[--two];
                nums[two] = nums[i];
                nums[i] = tmp;
            } else {
                int tmp = nums[++zero];
                nums[zero] = nums[i];
                nums[i++] = tmp;
            }
        }
    }
}
