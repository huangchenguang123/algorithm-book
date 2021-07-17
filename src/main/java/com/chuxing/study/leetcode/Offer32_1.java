package com.chuxing.study.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @date 2021/7/15
 * @author chenguang
 * @desc 剑指 Offer 32. 从上到下打印二叉树
 */
public class Offer32_1 {

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> result = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.add(node);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.poll().val;
        }
        return arr;
    }

    private static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

}
