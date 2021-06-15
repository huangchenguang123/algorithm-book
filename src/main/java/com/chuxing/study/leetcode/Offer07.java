package com.chuxing.study.leetcode;

/**
 * @date 2021/6/2
 * @author chenguang 
 * @desc 剑指 Offer 07. 重建二叉树
 */
public class Offer07 {

    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int preFrom, int preTo, int innerFrom, int innerTo) {
        if (preFrom < 0 || preFrom >= preorder.length
            || preTo < 0 || preTo >= preorder.length
            || innerFrom < 0 || innerFrom >= inorder.length
            || innerTo < 0 || innerTo >= inorder.length
            || preFrom > preTo
            || innerFrom > innerTo) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preFrom]);
        int leftSize = 0;
        for (int i = innerFrom; i <= innerTo; i++) {
            if (root.val == inorder[i]) {
                break;
            }
            leftSize++;
        }
        root.left = buildTree(preorder, inorder, preFrom + 1, preFrom + leftSize, innerFrom, innerFrom + leftSize - 1);
        root.right = buildTree(preorder, inorder, preFrom + leftSize + 1, preTo, innerFrom + leftSize + 1, innerTo);
        return root;
    }

    private class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

}
