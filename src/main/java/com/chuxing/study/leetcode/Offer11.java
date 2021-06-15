package com.chuxing.study.leetcode;

/**
 * @date 2021/6/15
 * @author chenguang 
 * @desc 剑指 Offer 11. 旋转数组的最小数字
 */
public class Offer11 {

    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int mid = (high + low) / 2;
            if (numbers[mid] < numbers[high]) {
                high = mid;
            } else if (numbers[mid] > numbers[high]) {
                low = mid + 1;
            } else if (numbers[mid] == numbers[high]) {
                high--;
            }
        }
        return numbers[low];
    }

}
