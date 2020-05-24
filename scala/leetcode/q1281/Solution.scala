package leetcode.q1281

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val n = 234
    val result = subtractProductAndSum(n)
    print(result)
  }

  /**
   * @date: 2020/5/22
   * @author: chenguang
   * @desc: 模拟
   */
  /**
   * @date: 2020/5/22
   * @result: true
   * @time: 100%
   * @memory usage: 100%
   */
  def subtractProductAndSum(n: Int): Int = {
    var number = n
    var product = 1
    var sum = 0
    while (number > 0) {
      val x = number % 10
      product = product * x
      sum = sum + x
      number = number / 10
    }
    product - sum
  }

}
