package com.chuxing.study.leetcode;

/**
 * @date 2021/6/16
 * @author chenguang 
 * @desc 剑指 Offer 18. 删除链表的节点
 */
public class Offer18 {

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}

class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

}
