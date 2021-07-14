package com.chuxing.study.leetcode;

/**
 * @date 2021/7/14
 * @author chenguang
 * @desc 剑指 Offer 35. 复杂链表的复制
 */
public class Offer35 {

    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // 1.复制
        Node p = head;
        while (p != null) {
            Node newNode = new Node(p.val);
            Node next = p.next;
            p.next = newNode;
            newNode.next = next;
            p = newNode.next;
        }
        // 2.连接
        p = head;
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
        // 3.拆分
        p = head;
        Node newHead = p.next;
        Node q = newHead;
        while (q != null) {
            p.next = p.next == null ? null : p.next.next;
            q.next = q.next == null ? null : q.next.next;
            p = p.next;
            q = q.next;
        }
        return newHead;
    }

    private static class Node {

        int val;

        Node next;

        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }

    }

}
