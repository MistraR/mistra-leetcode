package com.mistra.leetcode.array.easy;

/**
 * @author rui.wang
 * @ Version: 1.0
 * @ Time: 2023/2/10 16:35
 * @ Description:
 */
public class L26 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int l = 1;
        int pre = nums[0];
        int index = l;
        while (l < nums.length) {
            if (nums[l] == pre) {
                nums[l++] = 0;
            } else {
                pre = nums[l];
                nums[index++] = nums[l++];
            }
        }
        return index;
    }
}
