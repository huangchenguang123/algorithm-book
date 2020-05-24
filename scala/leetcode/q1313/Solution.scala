package leetcode.q1313

import scala.collection.mutable.ListBuffer

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val nums = Array(1, 2, 3, 4)
    val result = decompressRLElist(nums)
    print("[" + result.mkString(",") + "]")
  }

  /**
   * @date: 2020/5/23
   * @author: chenguang
   * @desc: 利用ListBuffer处理，scala中的List不可变
   */
  /**
   * @date: 2020/5/23
   * @result: true
   * @time: 100%
   * @memory usage: 100%
   */
  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    val list = new ListBuffer[Int]
    for (i <- Range(0, nums.length - 1, 2)) {
      var freq = nums(i)
      val value = nums(i+1)
      while (freq > 0) {
        list.addOne(value)
        freq = freq - 1
      }
    }
    list.toArray
  }

}
