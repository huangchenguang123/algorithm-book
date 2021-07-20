package com.chuxing.study.leetcode;

/**
 * @date 2021/7/19
 * @author chenguang
 * @desc 剑指 Offer 65. 不用加减乘除做加法
 */
public class Offer65 {

    public static void main(String[] args) {
        System.out.println(new Offer65().add(5, 6));
    }

    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }

}
