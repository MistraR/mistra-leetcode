package com.mistra.leetcode.array.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * <p>
 * 从后遍历，遇到一个数就把所有子集加上该数组成新的子集，遍历完毕即是所有子集
 *
 * @author mistra@future.com
 * @date 2023/3/10
 */
public class L78 {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            List<List<Integer>> ansTmp = new ArrayList<>();
            List<Integer> tmp = new ArrayList<>();
            tmp.add(nums[i]);
            ansTmp.add(tmp);
            if (ans.size() > 0) {
                for (List<Integer> integers : ans) {
                    List<Integer> tmp2 = new ArrayList<>();
                    tmp2.add(nums[i]);
                    tmp2.addAll(integers);
                    ansTmp.add(tmp2);
                }
            }
            ans.addAll(ansTmp);
        }
        ans.add(new ArrayList<>());
        return ans;
    }
}
