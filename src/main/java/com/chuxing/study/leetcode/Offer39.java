package com.chuxing.study.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @date 2021/7/16
 * @author chenguang
 * @desc 剑指 Offer 39. 数组中出现次数超过一半的数字
 */
public class Offer39 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 5};
        int num = new Offer39().majorityElement(arr);
        System.out.println(num);
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
