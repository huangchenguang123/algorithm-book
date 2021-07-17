package com.chuxing.study.leetcode;

import java.util.Stack;

/**
 * @date 2021/7/15
 * @author chenguang
 * @desc 剑指 Offer 36. 二叉搜索树与双向链表
 */
public class Offer36 {

    public static void main(String[] args) {
        Node node1 = new Node(4);
        Node node2 = new Node(2);
        Node node3 = new Node(5);
        Node node4 = new Node(1);
        Node node5 = new Node(3);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        Node root = new Offer36().treeToDoublyList(node1);
        System.out.println(root);
    }

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        Stack<Node> stack = new Stack<>();
        dfs(root, stack);
        Node pre = stack.pop();
        Node tail = pre;
        pre.right = null;
        while (!stack.isEmpty()) {
            stack.peek().right = pre;
            pre.left = stack.peek();
            pre = stack.pop();
        }
        pre.left = tail;
        tail.right = pre;
        return pre;
    }

    private void dfs(Node root, Stack<Node> stack) {
        if (root == null) {
            return;
        }
        dfs(root.left, stack);
        stack.push(root);
        dfs(root.right, stack);
    }

    private static class Node {

        public int val;

        public Node left;

        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }

    }

}