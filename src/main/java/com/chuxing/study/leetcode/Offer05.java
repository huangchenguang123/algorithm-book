package com.chuxing.study.leetcode;

/**
 * @date 2021/6/2
 * @author chenguang
 * @desc 剑指 Offer 05. 替换空格
 */
public class Offer05 {

    public static void main(String[] args) {

    }

    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        if (s != null && s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    sb.append("%20");
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

}
