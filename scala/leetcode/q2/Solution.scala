package leetcode.q2

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {

  }

  /**
   * date: 2020/5/31
   * author: chenguang
   * desc: 模拟加法
   */
  /**
   * date: 2020/5/31
   * result: true
   * time: 70%
   * memory usage: 100%
   */
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var left = l1
    var right = l2
    val head = new ListNode(0)
    var now = head
    var temp = 0
    while (left != null || right != null) {
      if (left != null) {
        temp = temp + left.x
        left = left.next
      }
      if (right != null) {
        temp = temp + right.x
        right = right.next
      }
      now.next = new ListNode(temp % 10)
      temp = temp / 10
      now = now.next
    }
    if (temp > 0) {
      now.next = new ListNode(temp)
    }
    head.next
  }
}

/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */
class ListNode(var _x: Int = 0) {

  var next: ListNode = null
  var x: Int = _x
}