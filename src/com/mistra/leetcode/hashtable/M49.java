package com.mistra.leetcode.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/15
 * @ Description:
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 *
 * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
 *
 * 示例 1:
 *
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class M49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
