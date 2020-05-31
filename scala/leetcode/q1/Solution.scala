package leetcode.q1

import scala.collection.mutable

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val nums = Array(2, 7, 11, 15)
    val target = 9
    val result = twoSum(nums, target)
    print(result.mkString("[", ",", "]"))
  }

  /**
   * @date: 2020/5/31
   * @author: chenguang
   * @desc: 利用hash/map的特性来对数组进行处理，key=num，value=index
   */
  /**
   * @date: 2020/5/31
   * @result: true
   * @time: 70%
   * @memory usage: 100%
   */
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val map = mutable.Map[Int, Int]()
    for (i <- nums.indices) {
      val num = nums(i)
      if (map.contains(target - num)) {
        return Array(i, map(target - num))
      }
      map.put(num, i)
    }
    Array()
  }

}