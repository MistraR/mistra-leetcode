package com.mistra.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/4 10:40 下午
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L645 {

    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,4};
        int[] arr = new int[]{2,2};
        Arrays.stream(findErrorNums(arr)).forEach(value -> System.out.println(value));
    }


    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1;
        int missing = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                dup = nums[i];
            } else if (nums[i] < nums[i + 1] -1) {
                missing = nums[i] + 1;
            }
        }
        return new int[] {dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }

}
