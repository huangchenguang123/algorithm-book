package leetcode.q26;

public class SolutionJ {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        SolutionJ solution = new SolutionJ();
        System.out.println(solution.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

}
