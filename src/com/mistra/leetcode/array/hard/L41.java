package com.mistra.leetcode.array.hard;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/8 10:36 下午
 * @ Description:
 * <p>
 * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。
 * <p>
 * 输入: [7,8,9,11,12]
 * 输出: 1
 *
 * 思路二
 * 遍历一次数组把大于等于1的和小于数组大小的值放到原数组对应位置，然后再遍历一次数组查当前下标是否和值对应，
 * 如果不对应那这个下标就是答案，否则遍历完都没出现那么答案就是数组长度加1。
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L41 {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(arr));
    }

    /**
     * 思路一
     * 我们将数组中所有小于等于 00 的数修改为 N+1N+1；
     *
     * 我们遍历数组中的每一个数 xx，它可能已经被打了标记，因此原本对应的数为 |x|∣x∣，其中 |\,|∣∣ 为绝对值符号。如果 |x| \in [1, N]∣x∣∈[1,N]，那么我们给数组中的第 |x| - 1∣x∣−1 个位置的数添加一个负号。注意如果它已经有负号，不需要重复添加；
     *
     * 在遍历完成之后，如果数组中的每一个数都是负数，那么答案是 N+1N+1，否则答案是第一个正数的位置加 11
     * @param nums
     * @return
     */
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
