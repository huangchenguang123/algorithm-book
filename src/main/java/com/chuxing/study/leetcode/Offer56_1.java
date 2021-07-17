package com.chuxing.study.leetcode;

/**
 * @date 2021/7/17
 * @author chenguang 
 * @desc 剑指 Offer 56 - I. 数组中数字出现的次数
 */
public class Offer56_1 {

    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        int target = 1;
        while ((target & res) == 0) {
            target <<= 1;
        }
        int a = 0, b = 0;
        for (int num : nums) {
            if ((target & num) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
    
}
