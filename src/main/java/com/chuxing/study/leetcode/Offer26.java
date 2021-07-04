package com.chuxing.study.leetcode;

/**
 * @date 2021/6/28
 * @author chenguang
 * @desc 剑指 Offer 26. 树的子结构
 */
public class Offer26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        boolean check = false;
        if (A.val == B.val) {
            check = check(A, B);
        }
        return check || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean check(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (B == null) {
            return true;
        }
        if (A.val == B.val) {
            return check(A.left, B.left) && check(A.right, B.right);
        }
        return false;
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
