package com.chuxing.study.concurrent;

/**
 * @date 2021/5/11
 * @author chenguang
 * @desc volatile测试
 */
public class VolatileDemo {

    private volatile int field = 1;

    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();
        demo.field = 2;
        System.out.println(demo.field);
    }

}
