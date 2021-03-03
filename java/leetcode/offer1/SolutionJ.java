package leetcode.offer1;


import java.util.HashSet;
import java.util.Set;

/**
 * @date 2021/3/3
 * @author chenguang
 * @desc 剑指 Offer 03. 数组中重复的数字
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字
 */
class SolutionJ {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(new SolutionJ().findRepeatNumber(nums));
    }

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int key : nums) {
            if (set.contains(key)) {
                return key;
            }
            set.add(key);
        }
        return 0;
    }

}
