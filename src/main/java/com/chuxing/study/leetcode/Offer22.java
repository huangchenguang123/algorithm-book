package com.chuxing.study.leetcode;

/**
 * @date 2021/7/14
 * @author chenguang
 * @desc 剑指 Offer 22. 链表中倒数第k个节点
 */
public class Offer22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while (p1 != null) {
            p1 = p1.next;
            if (k > 0) {
                k--;
            } else {
                p2 = p2.next;
            }
        }
        return p2;
    }

    private static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

}
