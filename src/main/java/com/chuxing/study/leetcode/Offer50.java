package com.chuxing.study.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @date 2021/7/16
 * @author chenguang
 * @desc 剑指 Offer 55. 第一个只出现一次的字符
 */
public class Offer50 {

    public char firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return ' ';
    }

}
