package com.chuxing.study.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author chenguang
 * @date 2021/5/13
 * @desc 使用读写锁实现的一个线程安全的HashMap
 */
public class Cache {

    static Map<String, Object> map = new HashMap<>();

    static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    static Lock r = rwl.readLock();

    static Lock w = rwl.writeLock();

    /**
     * @date 2021/5/13
     * @author chenguang
     * @desc 获取一个key对应的value
     */
    public static final Object get(String key) {
        r.lock();
        try {
            return map.get(key);
        } finally {
            r.unlock();
        }
    }

    /**
     * @date 2021/5/13
     * @author chenguang
     * @desc 设置key对应的value，并返回旧的value
     */
    public static final Object put(String key, Object value) {
        w.lock();
        try {
            return map.put(key, value);
        } finally {
            w.unlock();
        }
    }

    /**
     * @date 2021/5/13
     * @author chenguang
     * @desc 清空所有的内容
     */
    public static final void clear() {
        w.lock();
        try {
            map.clear();
        } finally {
            w.unlock();
        }
    }

}