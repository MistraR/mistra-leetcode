package com.mistra.leetcode.array.medium;

import java.util.Arrays;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/8 10:59 下午
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L274 {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 0, 6, 1, 5};
        System.out.println(hIndex(arr));
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i = 0;
        for (int i1 = citations.length - 1; i1 < citations.length && i1 > -1; i1--) {
            if (citations[i1] > i) {
                i++;
            }
        }
        return i;
    }
}
