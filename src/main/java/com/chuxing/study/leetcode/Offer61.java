package com.chuxing.study.leetcode;

import java.util.Arrays;

/**
 * @date 2021/7/20
 * @author chenguang
 * @desc 剑指 Offer 61. 扑克牌中的顺子
 */
public class Offer61 {

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int joker = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                joker++;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[4] - nums[joker] < 5;
    }

}
