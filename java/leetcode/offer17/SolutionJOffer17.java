package leetcode.offer17;

import java.util.Arrays;

/**
 * @date 2021/3/8
 * @author chenguang
 * @desc 剑指 Offer 17. 打印从1到最大的n位数
 *
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
public class SolutionJOffer17 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SolutionJOffer17().printNumbers(2)));
    }

    public int[] printNumbers(int n) {
        int max = (int) ((Math.pow(10, n)) - 1);
        int[] arr = new int[max];
        for (int i = 1; i <= max; i++) {
            arr[i - 1] = i;
        }
        return arr;
    }

}