package com.mistra.leetcode.双指针;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/20
 * @ Description:
 * 给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 *
 * 请你找出符合题意的 最短 子数组，并输出它的长度。
 *
 * 示例 1：
 *
 * 输入：nums = [2,6,4,8,10,9,15]
 * 输出：5
 * 解释：你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 */
public class M581 {
    public static void main(String[] args) {
//        System.out.println(findUnsortedSubarray(new int[]{1, 2, 3, 4}));
//        System.out.println(findUnsortedSubarray(new int[]{2, 1}));
//        System.out.println(findUnsortedSubarray(new int[]{1, 2, 3, 3, 3}));
        System.out.println(findUnsortedSubarray(new int[]{1, 3, 2, 2, 2}));
    }

    public static int findUnsortedSubarray(int[] nums) {
        //初始化
        int len = nums.length;
        int min = nums[len - 1];
        int max = nums[0];
        int begin = 0, end = -1;
        //遍历
        for (int i = 0; i < len; i++) {
            if (nums[i] < max) {      //从左到右维持最大值，寻找右边界end
                end = i;
            } else {
                max = nums[i];
            }

            if (nums[len - i - 1] > min) {    //从右到左维持最小值，寻找左边界begin
                begin = len - i - 1;
            } else {
                min = nums[len - i - 1];
            }
        }
        return end - begin + 1;
    }
}
