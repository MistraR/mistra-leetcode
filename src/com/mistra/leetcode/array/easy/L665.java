package com.mistra.leetcode.array.easy;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/11/9 10:34 下午
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L665 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(checkPossibility(arr));
    }

    public static boolean checkPossibility(int[] nums) {
        if(nums.length < 3) return true;
        int bp_count = 0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i+1] < nums[i]) {
                bp_count++;
                if(bp_count>1) return false;
                if(i>0 && nums[i-1] > nums[i+1])
                    nums[i+1] = nums[i];
            }
        }
        return true;
    }
}
