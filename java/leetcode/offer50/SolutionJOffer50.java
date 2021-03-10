package leetcode.offer50;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @date 2021/3/11
 * @author chenguang
 * @desc 剑指 Offer 50. 第一个只出现一次的字符
 *
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 */
public class SolutionJOffer50 {

    public static void main(String[] args) {
        System.out.println(new SolutionJOffer50().firstUniqChar("aadadaad"));
    }

    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, !map.containsKey(c));
        }
        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return ' ';
    }

}
