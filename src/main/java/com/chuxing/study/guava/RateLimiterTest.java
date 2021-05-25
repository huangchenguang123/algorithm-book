package com.chuxing.study.guava;

import com.google.common.util.concurrent.RateLimiter;

/**
 * @date 2021/5/25
 * @author chenguang
 * @desc rateLimiter test
 */
public class RateLimiterTest {

    public static void main(String[] args) {
        RateLimiter r = RateLimiter.create(5);
        while (true) {
            System.out.println("get 1 tokens: " + r.acquire() + "s");
        }
    }

}
