package com.chuxing.study.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @date 2021/5/11
 * @author chenguang 
 * @desc 剑指 Offer 03. 数组中重复的数字
 */
public class Offer03 {

    public static void main(String[] args) {

    }

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return 0;
    }

}
