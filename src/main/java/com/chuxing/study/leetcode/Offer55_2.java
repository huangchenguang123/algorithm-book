package com.chuxing.study.leetcode;

/**
 * @date 2021/7/20
 * @author chenguang
 * @desc 剑指 Offer 55. 平衡二叉树
 */
public class Offer55_2 {

    private Boolean result = true;

    public boolean isBalanced(TreeNode root) {
        depth(root);
        return result;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if (Math.abs(left - right) > 1) {
            result = false;
        }
        return Math.max(left, right) + 1;
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
