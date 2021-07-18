package com.chuxing.study.leetcode;

/**
 * @date 2021/7/18
 * @author chenguang 
 * @desc 剑指 Offer 54. 二叉搜索树的第k大节点
 */
public class Offer54 {

    private int k;

    private int res;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        k--;
        if (k == 0) {
            res = root.val;
        }
        dfs(root.left);
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
