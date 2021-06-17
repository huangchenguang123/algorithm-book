package com.chuxing.study.leetcode;

/**
 * @date 2021/6/16
 * @author chenguang 
 * @desc 剑指 Offer 12. 矩阵中的路径
 */
public class Offer12 {

    public static void main(String[] args) {
        char[][] board = new char[][]{{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        System.out.println(new Offer12().exist(board, "AAB"));
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (find(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean find(char[][] board, String word, int index, int i, int j) {
        char c = word.charAt(index);
        if (board[i][j] == c) {
            index++;
            if (index == word.length()) {
                return true;
            }
            board[i][j] = '*';
            boolean res = false;
            if (i - 1 >= 0) {
                res = res || find(board, word, index, i - 1, j);
            }
            if (i + 1 < board.length) {
                res = res || find(board, word, index, i + 1, j);
            }
            if (j - 1 >= 0) {
                res = res || find(board, word, index, i, j - 1);
            }
            if (j + 1 < board[0].length) {
                res = res || find(board, word, index, i, j + 1);
            }
            board[i][j] = c;
            return res;
        }
        return false;
    }

}
