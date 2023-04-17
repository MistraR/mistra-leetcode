package com.mistra.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/17
 * @ Description:
 */
public class M438 {

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }

    /**
     * 滑动窗口
     */
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) {
            return res;
        }
        int[] sarr = new int[26];
        int[] parr = new int[26];
        for (int i = 0; i < p.length(); i++) {
            parr[p.charAt(i) - 'a']++;
            sarr[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(sarr, parr)) {
            res.add(0);
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            sarr[s.charAt(i) - 'a']--;
            sarr[s.charAt(i + p.length()) - 'a']++;
            if (Arrays.equals(sarr, parr)) {
                res.add(i + 1);
            }
        }
        return res;
    }

    /**
     * 排序
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        int n = s.length();
        int k = p.length();
        if (n < k) {
            return res;
        }
        char[] chars = p.toCharArray();
        Arrays.sort(chars);
        p = new String(chars);
        // 只需要遍历一次，排序进行比较
        for (int i = 0; i <= n - k; i++) {
            // 找到长度为k的子字符串
            String temp = s.substring(i, i + k);
            // 进行排序
            chars = temp.toCharArray();
            Arrays.sort(chars);
            temp = new String(chars);
            if (p.equals(temp)) {
                res.add(i);
            }
        }
        return res;
    }
}
