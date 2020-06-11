package leetcode.q5408

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val target = Array(1, 2, 3, 4)
    val arr = Array(2, 4, 1, 3)
    val result = canBeEqual(target, arr)
    print(result)
  }

  /**
   * @date: 2020/5/31
   * @author: chenguang
   * @desc: 2个数组交换之后相等，只要数字相等即可。这里利用了^的特性，相同数字亦或为0
   */
  /**
   * @date: 2020/5/31
   * @result: true
   * @time: 100%
   * @memory usage: 100%
   */
  def canBeEqual(target: Array[Int], arr: Array[Int]): Boolean = {
    var temp = 0;
    for (i <- target.indices) {
      temp = temp ^ target(i) ^ arr(i)
    }
    temp == 0
  }

}