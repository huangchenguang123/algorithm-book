package com.chuxing.study.leetcode;

/**
 * @date 2021/7/15
 * @author chenguang
 * @desc 剑指 Offer 33. 二叉搜索树的后序遍历列表
 */
public class Offer33 {

    public static void main(String[] args) {
        System.out.println(new Offer33().verifyPostorder(new int[]{4, 5, 6, 7}));
    }

    public boolean verifyPostorder(int[] postorder) {
        return search(0, postorder.length - 1, postorder);
    }

    private boolean search(int start, int end, int[] postorder) {
        if (start >= end) {
            return true;
        }
        int root = postorder[end];
        int leftEnd = start;
        for (int i = start; i <= end; i++) {
            leftEnd = i;
            if (postorder[i] > root) {
                break;
            }
        }
        for (int i = leftEnd; i <= end; i++) {
            if (postorder[i] < root) {
                return false;
            }
        }
        return search(start, leftEnd - 1, postorder) && search(leftEnd, end - 1, postorder);
    }

}
