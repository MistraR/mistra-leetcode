package com.mistra.leetcode.array.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/4 11:13 下午
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L697 {

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 2, 3, 1, 4, 2};
        int[] arr = new int[]{1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(arr));
    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) {
                left.put(x, i);
            }
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        int d = nums.length;
        int max = Collections.max(count.values());
        for (Integer integer : count.keySet()) {
            if (count.get(integer) == max) {
                d = Math.min(d, right.get(integer) - left.get(integer) + 1);
            }
        }
        return d;
    }
}
