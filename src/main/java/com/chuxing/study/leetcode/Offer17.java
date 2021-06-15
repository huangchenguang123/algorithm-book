package com.chuxing.study.leetcode;

/**
 * @date 2021/6/16
 * @author chenguang 
 * @desc 剑指 Offer 17. 打印从1到最大的n位数
 */
public class Offer17 {

    public static void main(String[] args) {
        System.out.println(new Offer17().printNumbers(2));
    }

    public int[] printNumbers(int n) {
        int[] arr = new int[(int) Math.pow(10, n) - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

}
