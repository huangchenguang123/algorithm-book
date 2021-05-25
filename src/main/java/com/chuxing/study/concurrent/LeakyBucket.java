package com.chuxing.study.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.LockSupport;

/**
 * @date 2021/5/25
 * @author chenguang
 * @desc 漏桶算法
 */
public class LeakyBucket {

    /**
     * @date 2021/5/25
     * @author chenguang
     * @desc 内部阻塞队列
     */
    private final ArrayBlockingQueue<Thread> queue;

    public LeakyBucket(int queueSize, int rate) {
        queue = new ArrayBlockingQueue<>(queueSize);

        // 限流算法执行
        new Thread(() -> {
            try {
                long time = getSecond();
                int count = 0;

                while (true) {
                    // 同一秒钟内最多执行请求的次数
                    if (time == getSecond() && count <= rate) {
                        LockSupport.unpark(queue.take());
                        count++;
                    } else if (time != getSecond()) {
                        time = getSecond();
                        count = 0;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void acquire() {
        // 将当前线程加入队列
        queue.add(Thread.currentThread());
        // 挂起当前线程
        LockSupport.park(Thread.currentThread());
    }

    /**
     * @date 2021/5/25
     * @author chenguang
     * @desc 获取秒级时间戳
     */
    private long getSecond() {
        return System.currentTimeMillis() / 100;
    }

    public static void main(String[] args) {
        LeakyBucket leakyBucket = new LeakyBucket(100, 5);
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                leakyBucket.acquire();
                System.out.printf("%s acquire success, time=%s%n", Thread.currentThread(), System.currentTimeMillis());
            }).start();
        }
    }

}
