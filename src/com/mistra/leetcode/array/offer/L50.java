package com.mistra.leetcode.array.offer;

import java.util.HashMap;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/29 20:33
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L50 {

    public static void main(String[] args) {
        System.out.println(test("cc"));
    }


    public static char test(String str) {
        if (str == null || str.length() == 0) {
            return ' ';
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return ' ';
    }
}
