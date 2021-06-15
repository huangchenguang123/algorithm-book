package com.chuxing.study.leetcode;

/**
 * @date 2021/6/15
 * @author chenguang 
 * @desc 剑指 Offer 10- I. 斐波那契数列
 */
public class Offer10_1 {

    public int fib(int n) {
        int[] arr = new int[105];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            int temp = ((arr[i - 1]) % 1000000007 + (arr[i - 2]) % 1000000007) % 1000000007;
            arr[i] = temp;
        }
        return arr[n];
    }

}
