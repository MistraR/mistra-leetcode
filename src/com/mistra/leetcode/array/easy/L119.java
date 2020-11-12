package com.mistra.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/11 11:01 下午
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L119 {

    public static void main(String[] args) {
        System.out.println(generate(3));
    }

    public static List<Integer> generate(int numRows) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= numRows; i++) {
            for (int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j - 1) + result.get(j));
            }
            result.add(1);
        }
        return result;
    }
}
