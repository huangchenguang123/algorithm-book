package com.chuxing.study.leetcode;

/**
 * @date 2021/7/14
 * @author chenguang
 * @desc 剑指 Offer 42. 最大连续子数组的最大和
 */
public class Offer42 {

    public static void main(String[] args) {
        System.out.println(new Offer42().maxSubArray(new int[]{-1, 2}));
    }

    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            res = Math.max(res, temp);
            if (temp < 0) {
                temp = 0;
            }
        }
        return res;
    }

}
