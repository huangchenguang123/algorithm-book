package com.chuxing.study.leetcode;

/**
 * @date 2021/6/28
 * @author chenguang
 * @desc 剑指 Offer 28. 对称的二叉树
 */
public class Offer28 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(2);
        TreeNode left2 = new TreeNode(3);
        TreeNode left3 = new TreeNode(4);
        TreeNode right2 = new TreeNode(4);
        TreeNode right3 = new TreeNode(3);

        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = left3;
        right1.left = right2;
        right1.right = right3;

        System.out.println(new Offer28().isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return isSymmetric(left.right, right.left) && isSymmetric(left.left, right.right);
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
