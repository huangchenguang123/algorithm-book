package leetcode.offer40;

import java.util.PriorityQueue;

/**
 * @date 2021/3/14
 * @author chenguang
 * @desc 剑指 Offer 40. 最小的k个数
 *
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class SolutionJOffer40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] vec = new int[k];
        if (k == 0) {
            return vec;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

}
