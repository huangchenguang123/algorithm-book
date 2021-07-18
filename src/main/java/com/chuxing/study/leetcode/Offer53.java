package com.chuxing.study.leetcode;

/**
 * @date 2021/7/18
 * @author chenguang 
 * @desc 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */
public class Offer53 {

    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] != mid) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

}
