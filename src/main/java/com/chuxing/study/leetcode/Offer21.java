package com.chuxing.study.leetcode;

import java.util.Arrays;

/**
 * @date 2021/7/8
 * @author chenguang 
 * @desc 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 */
public class Offer21 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Offer21().exchange(new int[]{2, 4, 1, 3})));
    }

    public int[] exchange(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        return nums;
    }

}
