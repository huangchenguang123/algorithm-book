package leetcode.q1436

import scala.collection.mutable

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val paths = List(List("London","New York"), List("New York","Lima"), List("Lima","Sao Paulo"))
    val result = destCity(paths)
    print(result)
  }

  /**
   * @date: 2020/5/24
   * @author: chenguang
   * @desc: 利用集合的diff特性
   */
  /**
   * @date: 2020/5/24
   * @result: true
   * @time: 80%
   * @memory usage: 100%
   */
  def destCity(paths: List[List[String]]): String = {
    val fromSet = mutable.Set[String]()
    val toSet = mutable.Set[String]()
    paths.foreach(node => {
      fromSet.add(node.head)
      toSet.add(node(1))
    })
    toSet.diff(fromSet).head
  }

}
