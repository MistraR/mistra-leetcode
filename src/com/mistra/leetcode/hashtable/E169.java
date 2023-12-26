package com.mistra.leetcode.hashtable;

import java.util.HashMap;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/16
 * @ Description:
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class E169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            if (map.get(nums[i]) + 1 > nums.length / 2) {
                return nums[i];
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        return 0;
    }
}
