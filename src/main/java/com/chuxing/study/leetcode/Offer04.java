package com.chuxing.study.leetcode;

/**
 * @date 2021/5/23
 * @author chenguang
 * @desc 剑指 Offer 04. 二维数组中的查找
 */
public class Offer04 {

    public static void main(String[] args) {
        int[][] arr = new int[1][];
        arr[0] = new int[]{1, 1};
        Offer04 offer04 = new Offer04();
        offer04.findNumberIn2DArray(arr, 0);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int x = matrix[0].length, y = matrix.length;
        int i = x - 1, j = 0;
        while (i < x && i >= 0 && j < y && j >= 0) {
            if (matrix[j][i] == target) {
                return true;
            } else if (matrix[j][i] > target) {
                i--;
            } else if (matrix[j][i] < target) {
                j++;
            }
        }
        return false;
    }

}
