package leetcode.offer16;

/**
 * @date 2021/3/14
 * @author chenguang
 * @desc 剑指 Offer 16. 数值的整数次方
 *
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 */
public class SolutionJOffer16 {

    public static void main(String[] args) {
        System.out.println(new SolutionJOffer16().myPow(2.0d, 10));
        System.out.println(new SolutionJOffer16().myPow(2.1d, 3));
        System.out.println(new SolutionJOffer16().myPow(2.0d, -2));
    }

    public double myPow(double x, int n) {
        long nn = n;
        if (nn == 0) {
            return 1;
        }
        boolean mark = nn > 0;
        nn = mark ? nn : -nn;
        double temp = 1d;
        while (nn != 1) {
            if (nn % 2 == 0) {
                nn /= 2;
            } else {
                nn = (nn - 1) / 2;
                temp *= x;
            }
            x = x * x;
        }
        x *= temp;
        return mark ? x :  1.0d / x;
    }

}
