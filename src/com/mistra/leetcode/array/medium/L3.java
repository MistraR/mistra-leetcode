package com.mistra.leetcode.array.medium;

import java.util.HashMap;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 16:54
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L3 {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int start = 0, end = 0; end < s.length(); end++) {
            char tmp = s.charAt(end);
            if (map.containsKey(tmp)) {
                start = Math.max(start, map.get(tmp) + 1);
            }
            res = Math.max(res, end - start + 1);
            map.put(tmp, end);
        }
        return res;
    }

}
