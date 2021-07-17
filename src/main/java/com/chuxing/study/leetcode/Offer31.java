package com.chuxing.study.leetcode;

import java.util.Stack;

/**
 * @date 2021/7/15
 * @author chenguang
 * @desc 剑指 Offer 31. 栈的压入，弹出序列
 */
public class Offer31 {

    public static void main(String[] args) {
        System.out.println(new Offer31().validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed == null || popped == null) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int i = 0, j = 0;
        while (i < pushed.length) {
            stack.push(pushed[i]);
            i++;
            while (!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

}
