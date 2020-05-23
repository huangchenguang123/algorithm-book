package leetcode.q1365

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val nums = Array(8, 1, 2, 2, 3)
    val result = smallerNumbersThanCurrent(nums)
    print("[" + result.mkString(",") + "]")
  }

  /**
   * date: 2020/5/23
   * param:
   * return:
   * author: chenguang
   * desc: 由于数字给出范围0-100，所以可以用桶排的性质来做，如果没有给出范围，可以用Map来优化一下，或者使用暴力
   */
  /**
   * date: 2020/5/23
   * result: true
   * time: 85%
   * memory usage: 100%
   */
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    val length = 101
    val bucket = new Array[Int](length)
    nums.foreach(num => {
      bucket(num) = bucket(num) + 1
    })
    // 对桶的统计的中间数组
    val temps = new Array[Int](length)
    for (i <- 1 until length) {
      temps(i) = temps(i - 1) + bucket(i - 1)
    }
    val values = new Array[Int](nums.length)
    for (i <- values.indices) {
      values(i) = temps(nums(i))
    }
    values
  }

}
