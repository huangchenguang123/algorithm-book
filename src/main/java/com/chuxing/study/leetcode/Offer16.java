package com.chuxing.study.leetcode;

/**
 * @date 2021/6/15
 * @author chenguang 
 * @desc 剑指 Offer 16. 数值的整数次方
 */
public class Offer16 {

    public static void main(String[] args) {
        System.out.println(new Offer16().myPow(2.0d, 10));
    }

    public double myPow(double x, int n) {
        long nn = n;
        if (nn == 0) {
            return 1;
        }
        boolean flag = true;
        if (nn < 0) {
            flag = false;
            nn = -nn;
        }
        double temp = 1;
        while (nn > 1) {
            if (nn % 2 == 0) {
                x *= x;
                nn /= 2;
            } else {
                temp *= x;
                nn--;
            }
        }
        double result = x * temp;
        return flag ? result : 1.0 / result;
    }

}
