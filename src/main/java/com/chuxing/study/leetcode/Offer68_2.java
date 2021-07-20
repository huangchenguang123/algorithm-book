package com.chuxing.study.leetcode;

/**
 * @date 2021/7/20
 * @author chenguang
 * @desc 剑指 Offer 68. 二叉树的最近公共祖先
 */
public class Offer68_2 {

    private TreeNode result = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return result;
    }

    private boolean[] dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return new boolean[2];
        }
        boolean[] left = dfs(root.left, p, q);
        boolean[] right = dfs(root.right, p, q);
        if (((left[0] && right[1]) || (right[0] && left[1])) && result == null) {
            result = root;
            return new boolean[]{true, true};
        } else if (root.val == p.val && (left[1] || right[1])) {
            result = root;
            return new boolean[]{true, true};
        } else if (root.val == q.val && (left[0] || right[0])) {
            result = root;
            return new boolean[]{true, true};
        }
        if (root.val == p.val) {
            return new boolean[]{true, false};
        } else if (root.val == q.val) {
            return new boolean[]{false, true};
        } else if (left[0] || left[1]) {
            return left;
        } else if (right[0] || right[1]) {
            return right;
        }
        return new boolean[2];
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
