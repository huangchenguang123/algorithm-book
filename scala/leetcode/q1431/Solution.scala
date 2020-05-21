package leetcode.q1431

import scala.math.Ordering

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val candies = Array(2, 3, 5, 1, 3)
    val extraCandies = 3
    val result = kidsWithCandies(candies, extraCandies)
    print("[" + result.mkString(",") + "]")
  }

  /**
   * date: 2020/5/21
   * param:
   * return:
   * author: chenguang
   * desc: 先找出一个最大值，再循环判断，找出最大值使用IterableOnce.max()
   */
  /**
   * date: 2020/5/21
   * result: true
   * time: 85%
   * memory usage: 100%
   */
  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    val max = candies.max
    val result = new Array[Boolean](candies.length)
    for (i <- candies.indices) {
      result(i) = {
        candies(i) + extraCandies >= max
      }
    }
    result
  }

}
