package leetcode.q1290

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val node1 = new ListNode(1)
    val node2 = new ListNode(0)
    val node3 = new ListNode(1)
    node1.next = node2
    node2.next = node3
    val result = getDecimalValue(node1)
    print(result)
  }

  /**
   * @date: 2020/5/24
   * @author: chenguang
   * @desc: 2进制转10进制，模拟
   */
  /**
   * @date: 2020/5/24
   * @result: true
   * @time: 50%
   * @memory usage: 100%
   */
  def getDecimalValue(head: ListNode): Int = {
    var value = 0
    var node = head
    while (node != null) {
      value = value * 2 + node.x
      node = node.next
    }
    value
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
  var next: ListNode = _
  var x: Int = _x
}
