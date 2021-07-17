package com.chuxing.study.leetcode;

/**
 * @date 2021/7/17
 * @author chenguang
 * @desc 剑指 Offer 56 - II. 数组中数字出现的次数 II
 */
public class Offer56_2 {

    public int singleNumber(int[] nums) {
        int[] counts = new int[32];
        for (int num : nums) {
            for(int j = 0; j < 32; j++) {
                counts[j] += num & 1;
                num >>>= 1;
            }
        }
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (counts[i] % 3 != 0) {
                count += Math.pow(2, i);
            }
        }
        return count;
    }

}
