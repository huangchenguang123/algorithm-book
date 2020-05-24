package leetcode.q1389

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val nums = Array(0, 1, 2, 3, 4)
    val index = Array(0, 1, 2, 2, 1)
    val result = createTargetArray(nums, index)
    print("[" + result.mkString(",") + "]")
  }

  /**
   * @date: 2020/5/23
   * @author: chenguang
   * @desc: 模拟
   */
  /**
   * @date: 2020/5/23
   * @result: true
   * @time: 60%
   * @memory usage: 100%
   */
  def createTargetArray(nums: Array[Int], index: Array[Int]): Array[Int] = {
    val target = new Array[Int](nums.length)
    for (i <- nums.indices) {
      pushArray(index(i), target)
      target(index(i)) = nums(i)
    }
    target
  }

  def pushArray(index: Int, target:Array[Int]): Unit = {
    for (i <- (index until target.length - 1).reverse) {
      target(i + 1) = target(i)
    }
  }

}