package leetcode.q26

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val nums = Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val result = removeDuplicates(nums)
    print(nums.mkString("[", ",", "]"))
  }

  /**
   * @date: 2020/6/16
   * @author: chenguang
   * @desc: 模拟(双指针)，将和前一个不一样的数字排序到index位置
   */
  /**
   * @date: 2020/6/16
   * @result: true
   * @time: 90%
   * @memory usage: 100%
   */
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.length == 0) {
      return 0
    }
    var index = 1
    for (i <- 1 until nums.length) {
      if (nums(i) != nums(i - 1)) {
        nums(index) = nums(i)
        index = index + 1
      }
    }
    index
  }

}
