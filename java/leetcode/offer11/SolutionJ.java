package leetcode.offer11;

/**
 * @date 2021/3/5
 * @author chenguang
 * @desc 剑指 Offer 10- I. 斐波那契数列
 *
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）
 */
public class SolutionJ {

    public static void main(String[] args) {
        System.out.println(new SolutionJ().fib(5));
    }

    public int fib(int n) {
        int fn = 0, fn1 = 1, sum = 0;
        if (n == 0) {
            return fn;
        }
        if (n == 1) {
            return fn1;
        }
        for (int i = 2; i <= n; i++) {
            sum = (fn + fn1) % 1000000007;
            fn = fn1;
            fn1 = sum;
        }
        return sum;
    }

}
