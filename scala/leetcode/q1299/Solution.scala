package leetcode.q1299

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val arr = Array(17, 18, 5, 4, 6, 1)
    val result = replaceElements(arr)
    print(result.mkString("[", ",", "]"))
  }

  /**
   * date: 2020/5/25
   * author: chenguang
   * desc: 倒序处理
   */
  /**
   * date: 2020/5/25
   * result: true
   * time: 80%
   * memory usage: 100%
   */
  def replaceElements(arr: Array[Int]): Array[Int] = {
    var max = -1
    for (i <- arr.indices.reverse) {
      val temp = arr(i)
      arr(i) = max
      max = math.max(max, temp)
    }
    arr
  }

}
