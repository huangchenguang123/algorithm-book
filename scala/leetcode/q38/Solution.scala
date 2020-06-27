package leetcode.q38

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val n = 4
    val result = countAndSay(n)
    println(result)
  }

  /**
   * @date: 2020/6/27
   * @author: chenguang
   * @desc: 模拟
   */
  /**
   * @date: 2020/6/27
   * @result: true
   * @time: 40%
   * @memory usage: 100%
   */
  def countAndSay(n: Int): String = {
    val array = new Array[String](30)
    array(0) = "1"
    for (i <- 1 until 30) {
      val pre = array(i - 1)
      val s = new StringBuilder()
      var preChar = '_'
      var num = 0
      for (j <- pre.indices) {
        if ('_' != preChar && pre(j) != preChar) {
          s.append(num)
          s.append(preChar)
          preChar = pre(j)
          num = 1
        } else if ('_' == preChar) {
          preChar = pre(j)
          num = 1
        } else {
          num += 1
        }
      }
      s.append(num)
      s.append(preChar)
      array(i) = s.toString()
    }
    array(n - 1)
  }

}
