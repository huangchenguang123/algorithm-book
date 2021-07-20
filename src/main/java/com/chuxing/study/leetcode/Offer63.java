package com.chuxing.study.leetcode;

/**
 * @date 2021/7/20
 * @author chenguang
 * @desc 剑指 Offer 63. 股票的最大利润
 */
public class Offer63 {

    public static void main(String[] args) {
        System.out.println(new Offer63().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        if (prices == null) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else if (prices[i] - min > res) {
                res = prices[i] - min;
            }
        }
        return res;
    }

}
