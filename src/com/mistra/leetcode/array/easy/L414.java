package com.mistra.leetcode.array.easy;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/3 10:11 下午
 * @ Description:
 *
 * 比较好想的思路,借用TreeSet（红黑树）
 *
 * 维护一个只有3个元素的TreeSet，如果大于三个元素就就把Set中的最小最小值remove掉。
 * 最后如果Set中元素小于3就返回Set最大值，否则返回最小值。
 * 时间复杂度： O(n * log3) == O(n)

 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L414 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3, 1};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size()>3){
                set.remove(set.first());
            }
        }
        return set.size()<3?set.last():set.first();
    }
}
