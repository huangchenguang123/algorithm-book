package leetcode.lcp06

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val coins = Array(4, 2, 1)
    val result = minCount(coins)
    print(result)
  }

  /**
   * @date: 2020/5/24
   * @author: chenguang
   * @desc: 模拟
   */
  /**
   * @date: 2020/5/24
   * @result: true
   * @time: 100%
   * @memory usage: 100%
   */
  def minCount(coins: Array[Int]): Int = {
    var count = 0
    coins.foreach(coin => {
      count = count + (coin + 1) / 2
    })
    count
  }

}
