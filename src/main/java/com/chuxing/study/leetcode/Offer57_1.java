package com.chuxing.study.leetcode;

/**
 * @date 2021/7/16
 * @author chenguang
 * @desc 剑指 Offer 57. 和为s的两个数字
 */
public class Offer57_1 {

    public static void main(String[] args) {
        System.out.println(new Offer57_1().twoSum(new int[]{1, 2, 3}, 3));
    }

    public int[] twoSum(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                return new int[]{nums[start], nums[end]};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[0];
    }

}
