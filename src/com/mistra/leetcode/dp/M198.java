package com.mistra.leetcode.dp;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/13
 * @ Description:
 * 定义子问题
 * 写出子问题的递推关系
 * 确定 DP 数组的计算顺序
 * 空间优化（可选）
 *
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 * 示例 1：
 *
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 *
 * 关联213 337
 */
public class M198 {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        int[] dp = new int[length + 1];
        //
        dp[0] = 0;//没有房子，所以 f(0)=0
        dp[1] = nums[0];//只有1间房子
        for (int i = 2; i <= length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);//f(k)=max{f(k−1),Hk−1+f(k−2)} 假如3间房子，结果则为只偷第2间或者偷第1+第3间的最大值
        }
        return dp[length];
    }
}
