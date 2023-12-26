package com.mistra.leetcode.前缀和;

import java.util.Arrays;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/20
 * @ Description:
 * 给你一个整数数组nums，返回 数组answer，其中answer[i]等于nums中除nums[i]之外其余各元素的乘积。
 *
 * 题目数据 保证 数组nums之中任意元素的全部前缀元素和后缀的乘积都在 32 位 整数范围内。
 *
 * 请不要使用除法，且在O(n) 时间复杂度内完成此题。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,4]
 * 输出: [24,12,8,6]
 */
public class M238 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{2, 4, 1, 3, 5})));
    }

    /**
     * 1的乘积和 = 前缀2*4的和 * 后缀3*5的和
     * 所以构造一个前缀乘积和数组+一个后缀乘积和数组  再把相同下标相成就是答案
     * 把i的前缀之积和后缀之积都存在pre[i] suf[i]
     */
    public static int[] productExceptSelf(int[] nums) {
        if (nums.length < 1) {
            return nums;
        }
        int[] res = new int[nums.length];
        int[] pre = new int[nums.length];
        pre[0] = 1;//前缀 头结点的前缀之积就是1，因为不能为0，即没有前缀元素
        int[] suf = new int[nums.length];
        suf[nums.length - 1] = 1;//后缀尾节点的前缀之积也为1，即没有后缀元素
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];//4的前缀之积则为2*2的前缀之积 1的前缀之积则为4*4的前缀之积
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] * nums[i + 1];//同上
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = pre[i] * suf[i];
        }
        return res;
    }
}
