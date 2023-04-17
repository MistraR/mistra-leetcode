package com.mistra.leetcode.hashtable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/17
 * @ Description:
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
 *
 * 示例 1:
 *
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 */
public class M347 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(map::get));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (queue.size() < k) {
                queue.add(entry.getKey());
            } else if (map.get(entry.getKey()) > map.get(queue.peek())) {
                queue.remove();
                queue.add(entry.getKey());
            }
        }
        int[] res = new int[queue.size()];
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            res[i] = queue.remove();
        }
        return res;
    }
}
