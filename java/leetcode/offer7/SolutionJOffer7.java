package leetcode.offer7;

import java.util.Arrays;

/**
 * @date 2021/3/4
 * @author chenguang
 * @desc 剑指 Offer 07. 重建二叉树
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class SolutionJOffer7 {

    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        while (preorder != null && preorder.length > 0) {
            int root = preorder[0];
            TreeNode treeNode = new TreeNode(root);
            if (preorder.length > 1) {
                int index = 0;
                for (; index < inorder.length; index++) {
                    if (inorder[index] == root) {
                        break;
                    }
                }
                treeNode.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + index), Arrays.copyOfRange(inorder, 0, index));
                treeNode.right = buildTree(Arrays.copyOfRange(preorder, 1 + index, preorder.length), Arrays.copyOfRange(inorder, 1 + index, inorder.length));
            }
            return treeNode;
        }
        return null;
    }

}


class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

}

