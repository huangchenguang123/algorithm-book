package leetcode.q7

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val x = -109
    val result = reverse(x)
    print(result)
  }

  /**
   * @date: 2020/6/10
   * @author: chenguang
   * @desc: 模拟
   */
  /**
   * @date: 2020/6/10
   * @result: true
   * @time: 90%
   * @memory usage: 100%
   */
  def reverse(x: Int): Int = {
    var result = 0
    var n = x
    while (n != 0) {
      val temp = n % 10
      if (Int.MaxValue / 10 < result || Int.MinValue / 10 > result) {
        return 0
      }
      result = result * 10 + temp
      n = n / 10
    }
    result
  }

}