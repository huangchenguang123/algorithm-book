package com.chuxing.study.leetcode;

import java.util.Stack;

/**
 * @date 2021/7/14
 * @author chenguang
 * @desc 剑指 Offer 35. 包含min函数的栈
 */
public class Offer30 {

    private Stack<Integer> stack;

    private Stack<Integer> min;

    /** initialize your data structure here. */
    public Offer30() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty() || min.peek() >= x) {
            min.push(x);
        }
    }

    public void pop() {
        int num = stack.pop();
        if (num == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }

}
