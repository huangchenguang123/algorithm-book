package com.chuxing.study.leetcode;

/**
 * @date 2021/7/18
 * @author chenguang 
 * @desc 剑指 Offer 58 - I. 翻转单词顺序
 */
public class Offer58_1 {

    public static void main(String[] args) {
        System.out.println(new Offer58_1().reverseWords("     "));
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            } else {
                if (temp.length() > 0) {
                    sb.append(temp.reverse());
                    sb.append(" ");
                    temp = new StringBuilder();
                }
            }
        }
        if (temp.length() > 0) {
            sb.append(temp.reverse());
        }
        return sb.toString().trim();
    }

}
