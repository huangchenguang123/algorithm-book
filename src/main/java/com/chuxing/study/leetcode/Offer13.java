package com.chuxing.study.leetcode;

/**
 * @date 2021/6/16
 * @author chenguang
 * @desc 剑指 Offer 13. 机器人的运动范围
 */
public class Offer13 {

    private int count = 0;

    public static void main(String[] args) {
        System.out.println(new Offer13().movingCount(16, 8, 4));
    }

    public int movingCount(int m, int n, int k) {
        char[][] arr = new char[m][n];
        find(0, 0,  k, arr);
        return count;
    }

    private void find(int i, int j, int k, char[][] arr) {
        if (arr[i][j] == 'x' || getK(i) + getK(j) > k) {
            return;
        }
        arr[i][j] = 'x';
        count++;
        if (i - 1 >= 0) {
            find(i - 1, j, k, arr);
        }
        if (i + 1 < arr.length) {
            find(i + 1, j, k, arr);
        }
        if (j - 1 >= 0) {
            find(i, j - 1, k, arr);
        }
        if (j + 1 < arr[0].length) {
            find(i, j + 1, k, arr);
        }
    }

    private int getK(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }

}
