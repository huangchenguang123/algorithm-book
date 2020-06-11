package leetcode.m58

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val s = "abcdefg"
    val k = 2
    val result = reverseLeftWords(s, k)
    print(result)
  }

  //  /**
  //   * @date: 2020/5/21
  //   * @author: chenguang
  //   * @desc: 字符串拼接法
  //   */
  //  /**
  //   * @date: 2020/5/21
  //   * @result: true
  //   * @time: 70%
  //   * @memory usage: 100%
  //   */
  //  def reverseLeftWords(s: String, n: Int): String = {
  //    s.substring(n) + s.substring(0, n)
  //  }

  /**
   * @date: 2020/5/21
   * @author: chenguang
   * @desc: StringBuilder特性
   */
  /**
   * @date: 2020/5/21
   * @result: true
   * @time: 66%
   * @memory usage: 100%
   */
  def reverseLeftWords(s: String, n: Int): String = {
    val sb = new java.lang.StringBuilder()
    for (i <- n until s.length) {
      sb.append(s.charAt(i))
    }
    for (i <- 0 until n) {
      sb.append(s.charAt(i))
    }
    sb.toString
  }

}
