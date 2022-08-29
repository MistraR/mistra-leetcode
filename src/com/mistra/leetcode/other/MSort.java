package com.mistra.leetcode.other;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/28 20:38
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class MSort {

    public static void main(String[] args) {
        int[] arr1 = {24, 69, 80, 57, 13};
        int[] arr2 = {24, 69, 80, 57, 13};
        int[] arr3 = {24, 69, 80, 57, 13};
        maopao(arr1);
        xuanze(arr2);
        fast(arr3);
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void maopao(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void xuanze(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    /**
     * 快速排序
     *
     * @param arr
     */
    public static void fast(int[] arr) {

    }

    /**
     * 归并排序
     *
     * @param nums
     */
    public static int[] mergeSort(int[] nums) {
        //临时数组result
        int[] result = new int[nums.length];
        //归并排序
        mergeSort(nums, 0, nums.length - 1, result);
        //此时nums与result相同
        return result;//此时nums与result相同
    }

    // 对 nums 的 [start, end] 区间归并排序
    public static void mergeSort(int[] nums, int start, int end, int[] result) {
        // 只剩下一个数字，停止拆分
        if (start == end) return;
        int middle = (start + end) / 2;
        // 拆分左边区域，并将归并排序的结果保存到 result 的 [start, middle] 区间
        mergeSort(nums, start, middle, result);
        // 拆分右边区域，并将归并排序的结果保存到 result 的 [middle + 1, end] 区间
        mergeSort(nums, middle + 1, end, result);
        // 合并左右区域到 result 的 [start, end] 区间
        merge(nums, start, end, result);
    }

    // 将 nums 的 [start, middle] 和 [middle + 1, end] 区间合并
    public static void merge(int[] nums, int start, int end, int[] result) {
        //分割
        int middle = (start + end) / 2;
        // 数组 1 的首尾位置
        int start1 = start;
        int end1 = middle;
        // 数组 2 的首尾位置
        int start2 = middle + 1;
        int end2 = end;
        // 用来遍历数组的指针
        int index1 = start1;
        int index2 = start2;
        // 结果数组的指针
        int resultIndex = start1;
        //比较插入结果数组
        while (index1 <= end1 && index2 <= end2) {
            if (nums[index1] <= nums[index2]) {
                result[resultIndex++] = nums[index1++];
            } else {
                result[resultIndex++] = nums[index2++];
            }
        }
        // 将剩余数字补到结果数组之后
        while (index1 <= end1) {
            result[resultIndex++] = nums[index1++];
        }
        while (index2 <= end2) {
            result[resultIndex++] = nums[index2++];
        }
        // 将 result 操作区间的数字拷贝到 arr 数组中，以便下次比较
        for (int i = start; i <= end; i++) {
            nums[i] = result[i];
        }
    }

}
