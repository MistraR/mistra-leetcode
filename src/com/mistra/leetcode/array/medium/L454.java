package com.mistra.leetcode.array.medium;

import java.util.HashMap;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 19:45
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
for (int i = 0; i < nums1.length; i++) {
    for (int j = 0; j < nums2.length; j++) {
        if (map1.containsKey(nums1[i] + nums2[j])) {
            map1.put(nums1[i] + nums2[j], map1.get(nums1[i] + nums2[j]) + 1);
        } else {
            map1.put(nums1[i] + nums2[j], 1);
        }
    }
}
int res = 0;
for (int i = 0; i < nums3.length; i++) {
    for (int j = 0; j < nums4.length; j++) {
        if (map1.containsKey(-nums3[i] - nums4[j])) {
            res += map1.get(-nums3[i] - nums4[j]);
        }
    }
}
return res;
    }
}
