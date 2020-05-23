package leetcode.q771

import scala.collection.mutable

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val J = "aA"
    val S = "aAAbbbb"
    val result = numJewelsInStones(J, S)
    print(result)
  }

//  /**
//   * date: 2020/5/22
//   * param:
//   * return:
//   * author: chenguang
//   * desc: count函数可以统计符合条件的次数，详情见源码，可以自己实现
//   */
//  /**
//   * date: 2020/5/22
//   * result: true
//   * time: 50%
//   * memory usage: 100%
//   */
//  def numJewelsInStones(J: String, S: String): Int = {
//    S.count(J.contains(_))
//  }

  /**
   * date: 2020/5/22
   * param:
   * return:
   * author: chenguang
   * desc: set优化，o(n)时间复杂度
   */
  /**
   * date: 2020/5/22
   * result: true
   * time:
   * memory usage:
   */
  def numJewelsInStones(J: String, S: String): Int = {
    val set = scala.collection.mutable.Set[Char]()
    J.foreach(c => set.add(c))
    var sum = 0
    S.foreach(c => {
      if (set.contains(c)) {
        sum = sum + 1
      }
    })
    sum
  }

}
