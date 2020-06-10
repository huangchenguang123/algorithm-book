package leetcode.q13

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val s = "IV"
    val result = romanToInt(s)
    print(result)
  }

  /**
   * @date: 2020/6/10
   * @author: chenguang
   * @desc: 罗马数字规律，当前数字比下一个数字大，则执行加，否则执行减
   */
  /**
   * @date: 2020/6/10
   * @result: true
   * @time: 90%
   * @memory usage: 100%
   */
  def romanToInt(s: String): Int = {
    var result = 0
    for (i <- 0 until s.length - 1) {
      val num = romanToInt(s.charAt(i))
      val next = romanToInt(s.charAt(i + 1))
      result = if (num < next) {
        result - num
      } else {
        result + num
      }
    }
    result + romanToInt(s.charAt(s.length - 1))
  }

  /**
   * @date: 2020/6/10
   * @author: chenguang
   * @desc: 罗马数字转10进制数字
   */
  def romanToInt(char: Char): Int = {
    char match {
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
      case 'L' => 50
      case 'C' => 100
      case 'D' => 500
      case 'M' => 1000
    }
  }

}
