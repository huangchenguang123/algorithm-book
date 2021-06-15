package com.chuxing.study.leetcode;

/**
 * @date 2021/6/15
 * @author chenguang 
 * @desc 剑指 Offer 15. 二进制中1的个数
 */
public class Offer15 {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }

}
