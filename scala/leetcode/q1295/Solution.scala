package leetcode.q1295

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val nums = Array(12, 345, 2, 6, 7896)
    val result = findNumbers(nums)
    print(result)
  }

  /**
   * date: 2020/5/23
   * param:
   * return:
   * author: chenguang
   * desc: 转换成字符串处理，也可以利用数学方法(取对数或者直接除以10)
   */
  /**
   * date: 2020/5/23
   * result: true
   * time: 90%
   * memory usage: 100%
   */
  def findNumbers(nums: Array[Int]): Int = {
    nums.count(_.toString.length % 2 == 0)
  }

}
