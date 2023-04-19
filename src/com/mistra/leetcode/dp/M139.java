package com.mistra.leetcode.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/16
 * @ Description:
 *
 * 给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
 *
 * 注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。
 *
 * 示例 1：
 *
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以由 "leet" 和 "code" 拼接成
 *
 * 动态规划
 *
 * 可以类比于背包问题
 */
public class M139 {

    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        System.out.println(wordBreak("applepenapple", wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        // dp[i] 表示 s 中索引为 [0,  i - 1] 范围的字符串是否可被 wordDict 拆分
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                // [0, i - 1] 的字符串可被拆分，当前仅当任一子串 [0, j - 1] 及 [j, i - 1] 可被拆分
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
