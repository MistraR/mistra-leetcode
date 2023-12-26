package com.mistra.leetcode.hashtable;

import java.util.HashSet;

import com.mistra.leetcode.common.ListNode;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/16
 * @ Description:
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null
 */
public class E160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        HashSet<ListNode> set = new HashSet();
        while (headA != null) {
            set.add(headA);
            headA = headA.getNext();
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.getNext();
        }
        return null;
    }
}
