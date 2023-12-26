package com.mistra.leetcode.linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.mistra.leetcode.common.ListNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/17
 * @ Description:
 * 给你链表的头结点head，请将其按 升序 排列并返回 排序后的链表 。
 *
 * 示例 1：
 *
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 */
public class M148 {

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(ListNode::getVal));
        while (head != null) {
            queue.add(head);
            head = head.getNext();
        }
        head = queue.remove();
        ListNode pre = head;
        while (!queue.isEmpty()) {
            pre.setNext(queue.remove());
            pre = pre.getNext();
        }
        pre.setNext(null);
        return head;
    }
}
