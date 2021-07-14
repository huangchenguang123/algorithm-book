package com.chuxing.study.leetcode;

import java.util.PriorityQueue;

/**
 * @date 2021/7/14
 * @author chenguang
 * @desc 剑指 Offer 40. 最小的k个数
 */
public class Offer40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Integer::compareTo);
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

}
