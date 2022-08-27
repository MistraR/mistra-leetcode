package com.mistra.leetcode.string;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 13:58
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L344 {

    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char tmp = s[i];
            s[i++] = s[j];
            s[j--] = tmp;
        }
    }
}
