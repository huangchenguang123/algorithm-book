package leetcode.offer11;

/**
 * @date 2021/3/5
 * @author chenguang
 * @desc 
 */
public class SolutionJ {

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
