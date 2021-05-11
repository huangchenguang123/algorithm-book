package com.chuxing.study.concurrent;

/**
 * @author chenguang
 * @date 2021/5/11
 * @desc 死锁测试
 */
public class DeadLockDemo {

    private static final String A = "A";
    private static final String B = "B";

    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }

    private void deadLock() {
        Thread t1 = new Thread(() -> {
            synchronized (A) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (B) {
                    System.out.println("1");
                }
            }
        }, "AThread");
        Thread t2 = new Thread(() -> {
            synchronized (B) {
                synchronized (A) {
                    System.out.println("2");
                }
            }
        }, "BThread");
        t1.start();
        t2.start();
    }

}
