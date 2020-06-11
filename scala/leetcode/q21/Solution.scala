package leetcode.q21

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    // 省略
  }

  /**
   * @date: 2020/6/11
   * @author: chenguang
   * @desc: 迭代模拟，写法有优化，无需判断l1，l2为null的情况
   */
  /**
   * @date: 2020/6/11
   * @result: true
   * @time: 40%
   * @memory usage: 100%
   */
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    var p = l1
    var q = l2
    val head = new ListNode(-1)
    var node = head
    while (p != null && q != null) {
      if (p.x < q.x) {
        node.next = new ListNode(p.x)
        p = p.next
      } else {
        node.next = new ListNode(q.x)
        q = q.next
      }
      node = node.next
    }
    node.next = if (p == null) {
      q
    } else {
      p
    }
    head.next
  }

}

class ListNode(_x: Int = 0, _next: ListNode = null) {

  var next: ListNode = _next
  var x: Int = _x
}