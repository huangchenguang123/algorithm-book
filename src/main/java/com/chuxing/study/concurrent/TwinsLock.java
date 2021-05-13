package com.chuxing.study.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @date 2021/5/13
 * @author chenguang
 * @desc 不可重入的共享锁
 */
public class TwinsLock implements Lock {

    private static class Sync extends AbstractQueuedSynchronizer {

        public Sync(int count) throws RuntimeException {
            if (count <= 0) {
                throw new RuntimeException("count must large than zero.");
            }
            setState(count);
        }

        @Override
        protected boolean isHeldExclusively() {
            return false;
        }

        @Override
        public int tryAcquireShared(int arg) {
            for (; ; ) {
                int current = getState();
                int newCount = current - arg;
                if (newCount < 0 || compareAndSetState(current, newCount)) {
                    return newCount;
                }
            }
        }

        @Override
        protected boolean tryReleaseShared(int arg) {
            for (; ; ) {
                int current = getState();
                int newCount = current + arg;
                if (compareAndSetState(current, newCount)) {
                    return true;
                }
            }
        }

        Condition newCondition() {
            return new ConditionObject();
        }

    }

    private static final Sync SYNC = new Sync(2);

    @Override
    public void lock() {
        SYNC.acquireShared(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        SYNC.acquireSharedInterruptibly(1);
    }

    @Override
    public boolean tryLock() {
        return SYNC.tryAcquireShared(1) >= 0;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return SYNC.tryAcquireSharedNanos(1, time);
    }

    @Override
    public void unlock() {
        SYNC.releaseShared(1);
    }

    @Override
    public Condition newCondition() {
        return SYNC.newCondition();
    }

    public static void main(String[] args) {
        TwinsLock twinsLock = new TwinsLock();
        for (int i = 0; i <= 10; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                twinsLock.lock();
                System.out.println(Thread.currentThread().getName() + "lock twinsLock");
                System.out.println(Thread.currentThread().getName() + "unlock twinsLock");
                twinsLock.unlock();
            }, "Thread:" + i).start();
        }
    }

}
