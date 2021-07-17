package com.chuxing.study.leetcode;

/**
 * @date 2021/7/18
 * @author chenguang
 * @desc 剑指 Offer 52. 两个链表的第一个公共节点
 */
public class Offer52 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        System.out.println(new Offer52().getIntersectionNode(node1, node4));
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
        }
        return p;
    }

    private static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }

}
