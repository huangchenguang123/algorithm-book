package com.chuxing.study.leetcode;

/**
 * @date 2021/7/17
 * @author chenguang 
 * @desc 剑指 Offer 45. 把数组排成最小的数
 */
public class Offer45 {

    public static void main(String[] args) {
        System.out.println(new Offer45().minNumber(new int[]{3, 30, 34, 5, 9}));
    }

    public String minNumber(int[] nums) {
        sort(nums, 0, nums.length - 1);
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        return sb.toString();
    }

    private void sort(int[] nums, int start, int end) {
        if (nums == null || start >= end) {
            return;
        }
        int num = nums[end];
        int index = start;
        for (int i = start; i <= end; i++) {
            String a = "" + nums[i] + num;
            String b = "" + num + nums[i];
            if (a.compareTo(b) <= 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        sort(nums, start, index - 2);
        sort(nums, index, end);
    }

}
