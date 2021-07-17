package com.chuxing.study.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2021/7/15
 * @author chenguang
 * @desc 剑指 Offer 34. 二叉树中和为某一值的路径
 */
public class Offer34 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        node1.left = node2;

        System.out.println(new Offer34().pathSum(node1, 1));
    }

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        find(root, target, new ArrayList<>());
        return result;
    }

    public void find(TreeNode root, int target, List<Integer> temp) {
        if (root == null) {
            return;
        }
        List<Integer> newList = new ArrayList<>(temp);
        newList.add(root.val);

        if (root.left == null && root.right == null) {
            int sum = 0;
            for (int num : newList) {
                sum += num;
            }
            if (target == sum) {
                result.add(newList);
            }
        } else {
            find(root.left, target, newList);
            find(root.right, target, newList);
        }
    }

    private static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}
