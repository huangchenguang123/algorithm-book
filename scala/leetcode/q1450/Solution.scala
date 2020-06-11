package leetcode.q1450

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val startTime = Array(1, 2, 3)
    val endTime = Array(3, 2, 7)
    val queryTime = 4
    val result = busyStudent(startTime, endTime, queryTime)
    print(result)
  }

  /**
   * @date: 2020/5/21
   * @author: chenguang
   * @desc: 顺序遍历实现
   */
  /**
   * @date: 2020/5/21
   * @result: true
   * @time: 100%
   * @memory usage: 100%
   */
  def busyStudent(startTime: Array[Int], endTime: Array[Int], queryTime: Int): Int = {
    var times = 0
    for (i <- startTime.indices) {
      val start = startTime(i)
      val end = endTime(i)
      if (queryTime >= start && queryTime <= end) {
        times = times + 1
      }
    }
    times
  }

//    /**
//     * @date: 2020/5/21
//     * @author: chenguang
//     * @desc: ArrayOps.zip特性，将2个数组合并成为一个元组的数组
//     */
//    /**
//     * @date: 2020/5/21
//     * @result: true
//     * @time: 33%
//     * @memory usage: 100%
//     */
//    def busyStudent(startTime: Array[Int], endTime: Array[Int], queryTime: Int): Int = {
//      val xx = startTime.zip(endTime)
//      xx.count(x => x._1 <= queryTime && x._2 >= queryTime)
//    }

}
