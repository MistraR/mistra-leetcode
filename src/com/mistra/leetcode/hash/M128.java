package com.mistra.leetcode.hash;

import java.util.HashSet;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/15
 * @ Description:
 *
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 *
 * 请你设计并实现时间复杂度为O(n) 的算法解决此问题。
 *
 *
 * 示例 1：
 *
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 *
 * 这道题目最开始大家想的肯定是sort，然后计数计算最长序列。但是要求时间复杂度为：o(n)，就不能用sort了。
 * 一般在leetcode中，对时间复杂度有要求，就用空间来换，对空间复杂度有要求，就用时间来换。
 *
 * 基于这种思路我们就想要求最长的，就是要记录下有没有相邻的元素，比如遍历到100这个元素，我们需要查看[99, 101]这两个元素在不在序列中，这样去更新最大长度。
 * 而记录元素有没有这个事我们太熟悉了，用set这种数据结构，而set这种数据结构是需要o(n)的空间来换取的，这就是我们刚才说的用空间来换时间。
 */
public class M128 {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : nums) {
            set.remove(num);
            int length = 1;
            int current = num;
            while (set.remove(current + 1)) {
                current++;
            }
            length += current - num;
            current = num;
            while (set.remove(current - 1)) {
                current--;
            }
            length += num - current;
            max = Math.max(max, length);
        }
        return max;
    }
}
