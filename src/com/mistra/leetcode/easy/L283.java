package com.mistra.leetcode.easy;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/9/6 16:27
 * @ Description:
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * j用来记录下一个非0元素要放的位置
 *
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L283 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 0, 5, 1};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                if (i != j) {
                    arr[i] = 0;
                }
                j++;
            }
        }
        System.out.println(arr.toString());
    }
}
