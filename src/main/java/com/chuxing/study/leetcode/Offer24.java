package com.chuxing.study.leetcode;

/**
 * @date 2021/7/14
 * @author chenguang
 * @desc 剑指 Offer 24. 反转链表
 */
public class Offer24 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        while (head.next != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        head.next = pre;
        return head;
    }

    private static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

}
