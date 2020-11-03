package com.mistra.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/3 10:30 下午
 * @ Description:
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积
 * 输入: [1,2,3,4]
 * 输出: 24
 *
 * 我们将数组进行升序排序，如果数组中所有的元素都是非负数，那么答案即为最后三个元素的乘积。
 *
 * 如果数组中出现了负数，那么我们还需要考虑乘积中包含负数的情况，显然选择最小的两个负数和最大的一个正数是最优的，即为前两个元素与最后一个元素的乘积。
 *
 * 上述两个结果中的较大值就是答案。注意我们可以不用判断数组中到底有没有正数，0 或者负数，因为上述两个结果实际上已经包含了所有情况，最大值一定在其中
 *
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L628 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,-4};
        System.out.println(maximumProduct(arr));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],nums[0]*nums[1]*nums[nums.length-1]);
    }
}
