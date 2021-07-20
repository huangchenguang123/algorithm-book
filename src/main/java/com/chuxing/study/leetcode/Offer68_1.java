package com.chuxing.study.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2021/7/20
 * @author chenguang
 * @desc 剑指 Offer 68. 二叉搜索树的最近公共祖先
 */
public class Offer68_1 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> a = getPath(root, p);
        List<TreeNode> b = getPath(root, q);
        TreeNode node = null;
        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            if (a.get(i) != b.get(i)) {
                return node;
            } else {
                node = a.get(i);
            }
        }
        return node;
    }

    private List<TreeNode> getPath(TreeNode p, TreeNode node) {
        List<TreeNode> list = new ArrayList<>();
        while (p != null) {
            list.add(p);
            if (p.val > node.val) {
                p = p.left;
            } else if (p.val == node.val) {
                return list;
            } else {
                p = p.right;
            }
        }
        return list;
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
