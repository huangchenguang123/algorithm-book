package com.chuxing.study.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @date 2021/7/14
 * @author chenguang
 * @desc 剑指 Offer 40. 数据流中的中位数
 */
public class Offer41 {

    private PriorityQueue<Integer> min;

    private PriorityQueue<Integer> max;

    /** initialize your data structure here. */
    public Offer41() {
        min = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        max = new PriorityQueue<>(Comparator.comparingInt(o -> -o));
    }

    public void addNum(int num) {
        if (min.size() == max.size()) {
            max.add(num);
            min.add(max.poll());
        } else {
            min.add(num);
            max.add(min.poll());
        }
    }

    public double findMedian() {
        return min.size() != max.size() ? min.peek() : (min.peek() + max.peek()) / 2.0;
    }

}
