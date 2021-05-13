package com.chuxing.study.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @date 2021/5/12
 * @author chenguang
 * @desc 不可重入的独占锁
 */
public class Mutex implements Lock {

    // 静态内部类，自定义同步器
    private static class Sync extends AbstractQueuedSynchronizer {

        // 是否处于占用状态
        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        // 当状态为0的时候获取锁
        @Override
        public boolean tryAcquire(int acquires) {
            if (compareAndSetState(0, 1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        // 释放锁，将状态设置为0
        @Override
        protected boolean tryRelease(int releases) {
            if (getState() == 0) {
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        // 返回一个Condition，每个condition都包含了一个condition队列
        Condition newCondition() {
            return new ConditionObject();
        }

    }

    private static final Sync SYNC = new Sync();

    @Override
    public void lock() {
        SYNC.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        SYNC.acquireInterruptibly(1);
    }

    @Override
    public boolean tryLock() {
        return SYNC.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return SYNC.tryAcquireNanos(1, time);
    }

    @Override
    public void unlock() {
        SYNC.release(1);
    }

    @Override
    public Condition newCondition() {
        return SYNC.newCondition();
    }

    public static void main(String[] args) {
        Mutex mutex = new Mutex();
        for (int i = 0; i <= 5; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mutex.lock();
                System.out.println(Thread.currentThread().getName() + "lock mutex");
                System.out.println(Thread.currentThread().getName() + "unlock mutex");
                mutex.unlock();
            }, "Thread:" + i).start();
        }
    }

}
