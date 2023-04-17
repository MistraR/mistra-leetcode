package com.mistra.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

import com.mistra.leetcode.common.ListNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/17
 * @ Description:
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 *
 * 示例 1：
 *
 * 输入：head = [1,2,2,1]
 * 输出：true
 */
public class E234 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while (head != null) {
            list1.add(head.getVal());
            list2.add(0, head.getVal());
            head = head.getNext();
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
