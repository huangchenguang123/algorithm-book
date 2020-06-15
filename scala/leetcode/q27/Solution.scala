package leetcode.q27

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val nums = Array(0, 1, 2, 2, 3, 0, 4, 2)
    val `val` = 2
    val result = removeElement(nums, `val`)
    print(nums.mkString("[", ",", "]"))
  }

  /**
   * @author : chenguang
   * @date 2020/6/16
   * @desc : 模拟(双指针)，将不等于val的值都挪动到index位置
   */
  /**
   * @date 2020/6/16
   * @result: true
   * @time: 80%
   * @memory usage: 100%
   */
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var index = 0
    for (i <- nums.indices) {
      if (nums(i) != `val`) {
        nums(index) = nums(i)
        index = index + 1
      }
    }
    index
  }

}