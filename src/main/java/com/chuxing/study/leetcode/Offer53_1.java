package com.chuxing.study.leetcode;

/**
 * @date 2021/7/18
 * @author chenguang 
 * @desc 剑指 Offer 53 - I. 在排序数组中查找数字 I
 */
public class Offer53_1 {

    public static void main(String[] args) {
        System.out.println(new Offer53_1().search(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }

    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] <= target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        int right = i;
        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        int left = j;
        int result = right - left - 1;
        return Math.max(result, 0);
    }

}
