package leetcode.q20

import scala.collection.mutable

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val s = "{{}}"
    val result = isValid(s)
    print(result)
  }

  /**
   * @date: 2020/6/10
   * @author: chenguang
   * @desc: 利用栈的特性
   */
  /**
   * @date: 2020/6/10
   * @result: true
   * @time: 30%
   * @memory usage: 100%
   */
  def isValid(s: String): Boolean = {
    val stack = mutable.Stack[Char]()
    s.foreach(char => {
      if (char == ')' && stack.nonEmpty && stack.head == '(') {
        stack.pop()
      } else if (char == '}' && stack.nonEmpty && stack.head == '{') {
        stack.pop()
      } else if (char == ']' && stack.nonEmpty && stack.head == '[') {
        stack.pop()
      } else {
        stack.push(char)
      }
    })
    stack.isEmpty
  }

}
