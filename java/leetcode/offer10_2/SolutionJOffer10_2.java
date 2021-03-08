package leetcode.offer10_2;

/**
 * @date 2021/3/5
 * @author chenguang
 * @desc 剑指 Offer 10- II. 青蛙跳台阶问题
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class SolutionJOffer10_2 {

    public static void main(String[] args) {

    }

    public int numWays(int n) {
        int fn = 1, fn1 = 2, sum = 0;
        if (n == 0 || n == 1) {
            return fn;
        }
        if (n == 2) {
            return fn1;
        }
        for (int i = 3; i <= n; i++) {
            sum = fn + fn1;
            sum %= 1000000007;
            fn = fn1;
            fn1 = sum;
        }
        return sum;
    }

}
