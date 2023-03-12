package com.mistra.leetcode.other;

/**
 * 给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。
 *
 * 每个元素 nums[i] 表示从索引 i 向前跳转的最大长度。换句话说，如果你在 nums[i] 处，你可以跳转到任意 nums[i + j] 处:
 *
 * 0 <= j <= nums[i]
 * i + j < n
 * 返回到达nums[n - 1] 的最小跳跃次数。生成的测试用例可以到达 nums[n - 1]。
 *
 * 示例 1:
 *
 * 输入: nums = [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 * 从下标为 0 跳到下标为 1 的位置，跳1步，然后跳3步到达数组的最后一个位置。
 *
 * @author wrmistra@gmail.com
 * @date 2023/3/12
 */
public class L45 {

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
    }

    public static int jump(int[] nums) {
        int index = 0;
        int count = 0;
        int nextIndex = 0;
        int max = 0;
        while (index < nums.length - 1) {// 倒数第二位，只要到倒数第二位就可以跳导终点
            int step = nums[index];
            for (int i = index + 1; i < nums.length && i <= index + step; i++) {
                if (i == nums.length - 1) {// 直接碰到了数组右边界
                    count++;
                    return count;
                }
                if (i + nums[i] >= max) {
                    max = i + nums[i];// 从i 出发能到达最远的地方
                    nextIndex = i;// 如果大于最远的地方，更新nextIndex
                }
            }
            count++;
            index = nextIndex;// 找到了下一个index
        }
        return count;
    }
}
