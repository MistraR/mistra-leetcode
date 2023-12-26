package com.mistra.leetcode.前缀和;

import java.util.HashMap;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/18
 * @ Description:
 * 给你一个整数数组 nums 和一个整数k ，请你统计并返回 该数组中和为k的连续子数组的个数。
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,1], k = 2
 * 输出：2
 */
public class M569 {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 2, 1, 2, 1}, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        // 记录合适的连续字符串数量
        int count = 0;
        // 记录前面数字相加之和
        int pre = 0;
        // 统计前缀和的过程中  记录和为key的前缀和出现了几次  因为有些数字可能为负 所以会有前缀和相同的情况
        HashMap<Integer, Integer> map = new HashMap<>();
        // 初始化
        map.put(0, 1);
        for (int num : nums) {
            pre += num;// 前缀和
            // 设
            // pre[i]=pre[i−1]+nums[i]
            // 由于补上了0，1这个情况 问题由多少个连续数字之和等于k 转为
            // pre[i]−pre[j−1]==k （前缀和之差为k，代表这两个前缀和中间的数字相加就是K）***
            // 如果出现了 前面遍历过的前缀和+k=当前前缀和 说明找到了
            if (map.containsKey(pre - k)) {// 获取前面出现了几次 前缀和+k=pre，
                // 累计
                count += map.get(pre - k);
            }
            // 计算新的和放入map
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
