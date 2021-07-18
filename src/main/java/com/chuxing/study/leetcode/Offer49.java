package com.chuxing.study.leetcode;

public class Offer49 {

    public static void main(String[] args) {
        System.out.println(new Offer49().nthUglyNumber(10));
    }

    public int nthUglyNumber(int n) {
        int[] nums = new int[n + 1];
        nums[1] = 1;
        int p1 = 1, p2 = 1, p3 = 1;
        for (int i = 2; i <= n; i++) {
            int num1 = nums[p1] * 2;
            int num2 = nums[p2] * 3;
            int num3 = nums[p3] * 5;

            int res = Math.min(Math.min(num1, num2), num3);
            if (res == num1) {
                p1++;
            }
            if (res == num2) {
                p2++;
            }
            if (res == num3) {
                p3++;
            }
            nums[i] = res;
        }
        return nums[n];
    }

}
