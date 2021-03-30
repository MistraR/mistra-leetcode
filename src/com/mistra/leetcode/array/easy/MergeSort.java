package com.mistra.leetcode.array.easy;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/3/30 下午11:06
 * @ Description: 归并排序
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[]{8, 2, 0, 3, 5, 6};
        int[] b=mergeSort(a, 0, a.length - 1);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    private static int[] mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return null;
        }
        int mid = (left + right) >> 1;// (left + right)/2
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        return merge(arr, left, mid, right);
    }

    private static int[] merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            tmp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            tmp[k++] = arr[i++];
        }
        while (j <= right) {
            tmp[k++] = arr[j++];
        }
        for (int p = 0; p < tmp.length; p++) {
            arr[left + p] = tmp[p];
        }
        return arr;
    }
}
