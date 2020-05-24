package leetcode.q1323

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val num = 9969
    val result = maximum69Number(num)
    print(result)
  }

  /**
   * date: 2020/5/25
   * author: chenguang
   * desc: replaceFirst特性，手动实现亦可
   */
  /**
   * date: 2020/5/25
   * result: true
   * time: 100%
   * memory usage: 100%
   */
  def maximum69Number (num: Int): Int = {
    var number = String.valueOf(num)
    number = number.replaceFirst("6", "9")
    number.toInt
  }

}
