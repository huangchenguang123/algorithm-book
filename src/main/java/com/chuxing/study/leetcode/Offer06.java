package com.chuxing.study.leetcode;

import java.util.Stack;

/**
 * @date 2021/6/2
 * @author chenguang 
 * @desc 剑指 Offer 06. 从尾到头打印链表
 */
public class Offer06 {

    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] r = new int[stack.size()];
        for (int i = 0; i < r.length; i++) {
            r[i] = stack.pop();
        }
        return r;
    }

    private static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

}
