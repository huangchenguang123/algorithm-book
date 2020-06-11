package leetcode.q9

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val x = 10101
    val result = isPalindrome(x)
    print(result)
  }

  /**
   * @date: 2020/6/11
   * @author: chenguang
   * @desc: 利用除法和取余，取出数字的另一半，并且和前一半进行对比。
   *        对于负数，直接返回false，对于10的倍数，需要特殊处理(取余和除法无法处理这种情况)
   */
  /**
   * @date: 2020/6/11
   * @result: true
   * @time: 96%
   * @memory usage: 100%
   */
  def isPalindrome(x: Int): Boolean = {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false
    }
    var num = x
    var another = 0
    while (num > another) {
      another = another * 10 + num % 10
      num = num / 10
    }
    another == num || another / 10 ==  num
  }

}