package com.mistra.leetcode.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 18:51
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L202 {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
if (n < 0) {
    return false;
}
if (n == 1) {
    return true;
}
Set<Integer> set = new HashSet<>();
while (n != 1) {
    String str = n + "";
    char[] chars = str.toCharArray();
    int tmp = 0;
    for (int i = 0; i < chars.length; i++) {
        Integer integer = Integer.valueOf(String.valueOf(chars[i]));
        tmp += integer * integer;
    }
    if (set.contains(tmp)) {
        return false;
    } else {
        set.add(tmp);
        n = tmp;
    }
}
return true;
    }
}
