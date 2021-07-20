package com.chuxing.study.leetcode;

/**
 * @date 2021/7/20
 * @author chenguang 
 * @desc 剑指 Offer 64. 求1+2+...+n
 */
public class Offer64 {

    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }

}
