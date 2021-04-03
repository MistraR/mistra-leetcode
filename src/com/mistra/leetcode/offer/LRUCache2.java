package com.mistra.leetcode.offer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/3/31 下午9:59
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class LRUCache2 extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public LRUCache2(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
