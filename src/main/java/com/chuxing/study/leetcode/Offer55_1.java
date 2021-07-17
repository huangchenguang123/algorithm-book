package com.chuxing.study.leetcode;

/**
 * @date 2021/7/16
 * @author chenguang
 * @desc 剑指 Offer 55. 二叉树的深度
 */
public class Offer55_1 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
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
