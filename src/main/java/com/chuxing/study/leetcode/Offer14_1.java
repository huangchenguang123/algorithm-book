package com.chuxing.study.leetcode;

/**
 * @date 2021/6/28
 * @author chenguang
 * @desc 剑指 Offer 14. 剪绳子
 */
public class Offer14_1 {

    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3, b = n % 3;
        if (b == 0) {
            return (int) Math.pow(3, a);
        }
        if (b == 1) {
            return (int) Math.pow(3, a - 1) * 4;
        }
        return (int) Math.pow(3, a) * 2;
    }

}
