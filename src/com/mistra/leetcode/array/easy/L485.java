package com.mistra.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/10/30 8:56 下午
 * @ Description:
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 * <p>
 * 输入的数组只包含0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L485 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 0, 0, 1, 1};
        System.out.println(test(arr));

    }

    /**
     * 时间复杂度：O(N)。N值得是数组的长度。
     * 空间复杂度：O(1)，仅仅使用了 count 和 maxCount
     *
     * @param arr
     */
    private static int test(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
            } else {
                count = 0;
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}
