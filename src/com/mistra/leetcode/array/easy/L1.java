package com.mistra.leetcode.array.easy;

import java.util.HashMap;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/8 10:54 下午
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L1 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        System.out.println(twoSum(arr, 9).toString());
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
