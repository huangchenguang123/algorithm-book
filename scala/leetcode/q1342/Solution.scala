package leetcode.q1342

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val num = 14
    val result = numberOfSteps(num)
    print(result)
  }

  /**
   * date: 2020/5/22
   * param:
   * return:
   * author: chenguang
   * desc: 直接while即可，位运算的本质和while没区别，用递归的的问题是1.复杂2.大数会栈溢出
   */
  /**
   * date: 2020/5/22
   * result: true
   * time: 90%
   * memory usage: 100%
   */
  def numberOfSteps (num: Int): Int = {
    var number = num
    var count = 0
    while (number > 0) {
      if (number % 2 == 0) {
        number = number / 2
      } else {
        number = number - 1
      }
      count = count + 1
    }
    count
  }

}