package com.chuxing.study.leetcode;

/**
 * @date 2021/7/18
 * @author chenguang 
 * @desc 剑指 Offer 47. 礼物的最大价值
 */
public class Offer47 {

    public static void main(String[] args) {
        System.out.println(new Offer47().maxValue(new int[][]{{1, 3, 1}, {1, 5, 2}, {4, 2, 1}}));
    }

    public int maxValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                } else if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                } else {
                    grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }

}
