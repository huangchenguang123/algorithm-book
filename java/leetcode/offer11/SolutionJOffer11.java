package leetcode.offer11;

/**
 * @date 2021/3/5
 * @author chenguang
 * @desc 剑指 Offer 11. 旋转数组的最小数字
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 */
public class SolutionJOffer11 {

    public static void main(String[] args) {

    }

    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (numbers[mid] < numbers[high]) {
                high = mid;
            } else if (numbers[mid] > numbers[high]) {
                low = mid + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }

}
