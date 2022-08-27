package com.mistra.leetcode.array.medium;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 15:22
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L209 {

    public static void main(String[] args) {
//        minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        minSubArrayLen(6, new int[]{10, 2, 3});
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = -1, sum = 0, result = nums.length + 1;
        while (l < nums.length) {
            if (r < nums.length - 1 && sum < target) {
                sum += nums[++r];
            } else {
                sum -= nums[l++];
            }
            if (sum >= target) {
                result = Math.min(result, r - l + 1);
            }
        }
        if (result == nums.length + 1) {
            return 0;
        }
        return result;
    }
}
