package com.chuxing.study.leetcode;

import java.util.Stack;

/**
 * @date 2021/6/15
 * @author chenguang 
 * @desc 剑指 Offer 09. 用两个栈实现队列
 */
public class Offer09 {

    private Stack<Integer> stack1;

    private Stack<Integer> stack2;

    public Offer09() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.empty() ? -1 : stack2.pop();
    }

}
