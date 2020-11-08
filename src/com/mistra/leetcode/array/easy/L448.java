package com.mistra.leetcode.array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/5 11:07 下午
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L448 {

    public static void main(String[] args) {
                int[] arr = new int[]{1,1};
//        int[] arr = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], true);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!hashMap.containsKey(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
