package leetcode.q1221

import scala.collection.mutable

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val s = "RLRRLLRLRL"
    val result = balancedStringSplit(s)
    print(result)
  }

  /**
   * @date: 2020/5/25
   * @author: chenguang
   * @desc: 利用栈的特性，两两消除
   */
  /**
   * @date: 2020/5/25
   * @result: true
   * @time: 50%
   * @memory usage: 100%
   */
  def balancedStringSplit(s: String): Int = {
    val stack = mutable.Stack[Char]()
    var count = 0
    s.foreach(char => {
      if (stack.nonEmpty && ((stack.head == 'R' && char == 'L') || (stack.head == 'L' && char == 'R'))) {
        stack.pop()
      } else {
        stack.push(char)
      }
      if (stack.isEmpty) {
        count = count + 1
      }
    })
    count
  }

}