package com.chuxing.study.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @date 2021/7/15
 * @author chenguang
 * @desc 剑指 Offer 32. 从上到下打印二叉树
 */
public class Offer32_2 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        Queue<LevelNode> queue = new LinkedList<>();
        Map<Integer, List<LevelNode>> map = new HashMap<>();

        queue.add(new LevelNode(root, 0));
        while (!queue.isEmpty()) {
            LevelNode node = queue.poll();
            List<LevelNode> list = map.getOrDefault(node.level, new LinkedList<>());
            list.add(node);
            map.put(node.level, list);
            if (node.node.left != null) {
                queue.add(new LevelNode(node.node.left, node.level + 1));
            }
            if (node.node.right != null) {
                queue.add(new LevelNode(node.node.right, node.level + 1));
            }
        }
        return map.values().stream()
                .map(levelNodes -> levelNodes.stream()
                        .map(levelNode -> levelNode.node.val)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    private static class LevelNode {

        private TreeNode node;

        private Integer level;

        public LevelNode(TreeNode node, Integer level) {
            this.node = node;
            this.level = level;
        }

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
