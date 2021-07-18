package com.chuxing.study.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Offer48 {

    public static void main(String[] args) {
        System.out.println(new Offer48().lengthOfLongestSubstring("abba"));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0, left = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)), left);
            }
            map.put(s.charAt(right), right);
            max = Math.max(max, right - left);
        }
        return max;
    }

}
