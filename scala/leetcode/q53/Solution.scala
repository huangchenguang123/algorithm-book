package leetcode.q53

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val nums = Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val result = maxSubArray(nums)
    println(result)
  }

  /**
   * @date: 2020/6/27
   * @author: chenguang
   * @desc: 贪心算法，如果之前的和为负数，则丢弃之前的值
   */
  /**
   * @date: 2020/6/27
   * @result: true
   * @time: 40%
   * @memory usage: 100%
   */
  def maxSubArray(nums: Array[Int]): Int = {
    var max = Int.MinValue
    var temp = 0
    for (i <- nums.indices) {
      temp = math.max(temp + nums(i), nums(i))
      max = math.max(max, temp)
    }
    max
  }

}