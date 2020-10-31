package com.mistra.leetcode.array.medium;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/10/30 8:56 下午
 * @ Description:
 * 提莫攻击
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L495 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 6};
        System.out.println(findPoisonedDuration(arr, 2));

    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            sum += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        return sum + duration;
    }
}
