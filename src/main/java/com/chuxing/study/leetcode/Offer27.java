package com.chuxing.study.leetcode;

/**
 * @date 2021/6/28
 * @author chenguang
 * @desc 剑指 Offer 27. 二叉树的镜像
 */
public class Offer27 {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
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
