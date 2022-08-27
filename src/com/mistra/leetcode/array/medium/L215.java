package com.mistra.leetcode.array.medium;

import java.util.PriorityQueue;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 14:44
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L215 {

    public static void main(String[] args) {

    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int t : nums) {
            heap.add(t);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.peek();
    }
}
