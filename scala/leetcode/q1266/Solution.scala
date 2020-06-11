package leetcode.q1266

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val points = Array(Array(1, 1), Array(3, 4), Array(-1, 0))
    val result = minTimeToVisitAllPoints(points)
    print(result)
  }

  /**
   * @date: 2020/5/23
   * @author: chenguang
   * @desc: 切比雪夫距离
   */
  /**
   * @date: 2020/5/23
   * @result: true
   * @time: 90%
   * @memory usage: 100%
   */
  def minTimeToVisitAllPoints(points: Array[Array[Int]]): Int = {
    var sum = 0
    for (i <- 1 until points.length) {
      val point0 = points(i - 1)
      val point1 = points(i)
      val x0 = point0(0)
      val y0 = point0(1)
      val x1 = point1(0)
      val y1 = point1(1)
      sum = sum + math.max(math.abs(x0 - x1), math.abs(y0 - y1))
    }
    sum
  }

}
