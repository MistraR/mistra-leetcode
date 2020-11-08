package com.mistra.leetcode.array.easy;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/9/4 20:58
 * @ Description:
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * 关联L442
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L136 {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr));
        System.out.println(0 ^ 4);
        System.out.println(5 ^ 4 ^ 4);
    }

    /**
     * 同一个数 亦或 操作两次都会得到0，0与任何数  亦或 都会得到那个数本身
     *
     * @param arr
     * @return
     */
    public static int singleNumber(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[0] = arr[0] ^ arr[i];
        }
        return arr[0];
    }
}


