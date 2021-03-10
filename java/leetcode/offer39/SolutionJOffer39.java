package leetcode.offer39;

/**
 * @date 2021/3/11
 * @author chenguang
 * @desc 剑指 Offer 39. 数组中出现次数超过一半的数字
 *
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 */
public class SolutionJOffer39 {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int current = nums[0];
        int vote = 0;
        for (int i = 0; i < nums.length; i++) {
            if (current == nums[i]) {
                vote++;
            } else {
                vote--;
                if (vote == 0) {
                    current = nums[i];
                    vote = 1;
                }
            }
        }
        return current;
    }

}
