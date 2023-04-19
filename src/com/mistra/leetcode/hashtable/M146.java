package com.mistra.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/19
 * @ Description: LRU缓存
 */
public class M146 {

    class LRUNode {
        int key;
        int value;
        LRUNode next;
        LRUNode pre;
    }

    Map<Integer, LRUNode> map = new HashMap<>();
    LRUNode head;
    LRUNode tail;
    int size;
    int capacity;

    /**
     * 以 正整数 作为容量 capacity 初始化 LRU 缓存
     */
    public M146(int capacity) {
        this.capacity = capacity;
        size = 0;
        head = new LRUNode();//虚拟头结点
        tail = new LRUNode();//虚拟尾结点
        head.next = tail;//头尾组成链表
        tail.pre = head;
    }

    /**
     * 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1
     */
    public int get(int key) {
        if (map.get(key) != null) {
            moveToHead(map.get(key));
            return map.get(key).value;
        } else {
            return -1;
        }
    }

    /**
     * 如果关键字key 已经存在，则变更其数据值value ；如果不存在，则向缓存中插入该组key-value 。如果插入操作导致关键字数量超过capacity ，则应该 逐出 最久未使用的关键字。
     */
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            LRUNode lruNode = map.get(key);
            lruNode.value = value;
            moveToHead(lruNode);
        } else {
            LRUNode lruNode = new LRUNode();
            lruNode.key = key;
            lruNode.value = value;
            map.put(key, lruNode);
            addToHead(lruNode);
            size++;
            if (size > capacity) {
                LRUNode tmp = tail.pre;
                removeNode(tmp);
                map.remove(tmp.key);
                size--;
            }
        }
    }

    public void moveToHead(LRUNode lruNode) {
        removeNode(lruNode);//先从原来的位置移除
        addToHead(lruNode);//添加到头结点
    }

    /**
     * 添加一个节点到head
     */
    private void addToHead(LRUNode lruNode) {
        lruNode.next = head.next;
        head.next.pre = lruNode;
        head.next = lruNode;
        lruNode.pre = head;
    }

    /**
     * 移除一个节点
     */
    public void removeNode(LRUNode lruNode) {
        lruNode.pre.next = lruNode.next;
        lruNode.next.pre = lruNode.pre;
    }
}
