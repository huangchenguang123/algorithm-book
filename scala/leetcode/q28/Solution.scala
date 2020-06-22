package leetcode.q28

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val haystack = "hello"
    val needle = "ll"
    val result = strStr(haystack, needle)
    print(result)
  }

  /**
   * @date 2020/6/17
   * @author : chenguang
   * @desc : subString实现，还有其他更加优秀的算法
   */
  /**
   * @date 2020/6/17
   * @result: true
   * @time: 80%
   * @memory usage: 100%
   */
  def strStr(haystack: String, needle: String): Int = {
    val length = needle.length
    if (length == 0) return 0
    for (i <- 0 to (haystack.length - length)) {
      if (haystack(i) == needle(0) && haystack.substring(i, i + length).equals(needle)) {
          return i
      }
    }
    -1
  }

}
