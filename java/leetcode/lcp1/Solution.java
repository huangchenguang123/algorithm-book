package leetcode.lcp1;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] guess = {1, 2, 3};
        int[] answer = {1, 2, 3};
        int result = solution.game(guess, answer);
        System.out.println(result);
    }

    /**
     * @date: 2020/5/22
     * @author: chenguang
     * @desc: 直接的解法，因为题目只有3个数，可以直接if，但是没有必要
     */
    /**
     * @date: 2020/5/22
     * @result: true
     * @time: 100%
     * @memory usage: 5%
     */
    public int game(int[] guess, int[] answer) {
        int times = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                times++;
            }
        }
        return times;
    }

}
