package leetcode.q1021

import scala.collection.mutable

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val S = "(()())(())"
    val result = removeOuterParentheses(S)
    print(result)
  }

  /**
   * @date: 2020/5/25
   * @author: chenguang
   * @desc: 模拟
   */
  /**
   * @date: 2020/5/25
   * @result: true
   * @time: 70%
   * @memory usage: 100%
   */
  def removeOuterParentheses(S: String): String = {
    val result = new StringBuilder
    val stack = mutable.Stack[Char]()
    S.foreach(char => {
      if (char == '(') {
        if (stack.nonEmpty) {
          result.append('(')
        }
        stack.push('(')
      } else {
        if (stack.head == '(') {
          stack.pop()
        }
        if (stack.nonEmpty) {
          result.append(')')
        }
      }
    })
    result.mkString
  }

}
