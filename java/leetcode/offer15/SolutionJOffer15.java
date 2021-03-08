package leetcode.offer15;

/**
 * @date 2021/3/8
 * @author chenguang
 * @desc 剑指 Offer 15. 二进制中1的个数
 *
 * 请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 */
public class SolutionJOffer15 {

    public static void main(String[] args) {
        System.out.println(new SolutionJOffer15().hammingWeight(00000000000000000000000000001011));
    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

}
