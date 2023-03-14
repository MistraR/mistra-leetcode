package com.mistra.leetcode.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * @author wrmistra@gmail.com
 * @date 2023/3/14
 */
public class L17 {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        dfs(map, new StringBuilder(), digits, 0, ans);
        return ans;
    }

    public static void dfs(HashMap<Character, String> map, StringBuilder str, String digits, int index, List<String> ans) {
        if (digits.length() == index) {
            ans.add(str.toString());
            return;
        }
        char charAt = digits.charAt(index);
        String s = map.get(charAt);
        for (int i = 0; i < s.length(); i++) {
            str.append(s.charAt(i));
            dfs(map, str, digits, index + 1, ans);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
