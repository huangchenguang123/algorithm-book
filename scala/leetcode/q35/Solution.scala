package leetcode.q35

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val nums = Array(1, 3, 5, 7, 9, 11, 13)
    val target = 6
    val result = searchInsert(nums, target)
    print(result)
  }

  /**
   * @author : chenguang
   * @date 2020/6/17
   * @desc : 经典2分查找法
   */
  /**
   * @date 2020/6/17
   * @result: true
   * @time: 100%
   * @memory usage: 100%
   */
  def searchInsert(nums: Array[Int], target: Int): Int              = {
    var left = 0
    var right = nums.length - 1
    while (left <= right) {
      val mid = (left + right) / 2
      if (nums(mid) == target) {
        return mid
      } else if (nums(mid) < target) {
        left = mid + 1
      } else {
        right = mid - 1
      }
    }
    left
  }

}
