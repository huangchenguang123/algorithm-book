package leetcode.q7

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val x = 123
    val result = reverse(x)
    print(result)
  }

  def reverse(x: Int): Int = {
    var result = 0
    var n = math.abs(x)
    while (n > 0) {
      val temp = n % 10
      result = result * 10 + temp
      n = n / 10
    }
    result
  }

}