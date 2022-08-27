package com.mistra.leetcode.array.easy;

import java.util.HashMap;
import java.util.HashSet;

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
        System.out.println(twoSum(arr, 9));
        System.out.println(twoSum2(arr, 22));
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

    /**
     * 有序的数组可以用碰撞指针
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int[] result = new int[2];
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
                return result;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }

}
