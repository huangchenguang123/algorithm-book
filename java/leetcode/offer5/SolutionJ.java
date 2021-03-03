package leetcode.offer5;

/**
 * @date 2021/3/4
 * @author chenguang
 * @desc 剑指 Offer 05. 替换空格
 *
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class SolutionJ {

    public static void main(String[] args) {
        System.out.println(new SolutionJ().replaceSpace("We are happy."));
    }

    public String replaceSpace(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
