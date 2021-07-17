package com.chuxing.study.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2021/7/16
 * @author chenguang
 * @desc 剑指 Offer 57. 和为s的连续正数序列
 */
public class Offer57_2 {

    public static void main(String[] args) {
        System.out.println(new Offer57_2().findContinuousSequence(15));
    }

    public int[][] findContinuousSequence(int target) {
        List<List<Integer>> list = new ArrayList<>();
        int l = 1, r = 2;
        while (l < r && l < target && r < target) {
            int sum = (l + r) * (r - l + 1) / 2;
            if (sum == target) {
                List<Integer> temp = new ArrayList<>();
                for (int i = l; i <= r; i++) {
                    temp.add(i);
                }
                list.add(temp);
                l++;
            } else if (sum < target) {
                r++;
            } else {
                l++;
            }
        }
        int[][] result = new int[list.size()][];
        for (int i = 0; i < result.length; i++) {
            List<Integer> tempList = list.get(i);
            int[] tempArr = new int[tempList.size()];
            for (int j = 0; j < tempArr.length; j++) {
                tempArr[j] = tempList.get(j);
            }
            result[i] = tempArr;
        }
        return result;
    }

}
