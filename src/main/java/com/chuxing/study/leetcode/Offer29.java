package com.chuxing.study.leetcode;

import java.util.Arrays;

/**
 * @date 2021/7/8
 * @author chenguang
 * @desc 剑指 Offer 29. 顺时针打印矩阵
 */
public class Offer29 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Offer29().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }

        int[] result = new int[matrix.length * matrix[0].length];
        int index = 0;

        int max = (matrix.length + 1) / 2;
        int i = -1, j = -1;
        for (int c = 0; c < max; c++) {
            int direction = 1;
            i++;
            j++;
            while (true) {
                if (index < result.length) {
                    result[index] = matrix[i][j];
                    index++;
                }

                if (direction == 1) {
                    if (j < matrix[0].length - c - 1) {
                        j++;
                    } else {
                        i++;
                        direction = 2;
                    }
                    continue;
                }
                if (direction == 2) {
                    if (i < matrix.length - c - 1) {
                        i++;
                    } else {
                        j--;
                        direction = 3;
                    }
                    continue;
                }
                if (direction == 3) {
                    if (j > c) {
                        j--;
                    } else {
                        i--;
                        direction = 4;
                    }
                    continue;
                }
                if (direction == 4) {
                    if (i > c + 1) {
                        i--;
                    } else {
                        direction = 1;
                        i--;
                        break;
                    }
                }
            }
        }
        return result;
    }

}
