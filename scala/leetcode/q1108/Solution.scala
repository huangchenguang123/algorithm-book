package leetcode.q1108

class Solution {}

object Solution {

  def main(args: Array[String]): Unit = {
    val address = "1.1.1.1"
    val result = defangIPaddr(address)
    print(result)
  }

//  /**
//   * date: 2020/5/22
//   * param:
//   * return:
//   * author: chenguang
//   * desc: String.replaceAll()，原理利用StringBuilder操作
//   */
//  /**
//   * date: 2020/5/22
//   * result: true
//   * time: 50%
//   * memory usage: 100%
//   */
//  def defangIPaddr(address: String): String = {
//    address.replaceAll("\\.", "[.]")
//  }

  /**
   * date: 2020/5/22
   * param:
   * return:
   * author: chenguang
   * desc: StringBuilder手动实现
   */
  /**
   * date: 2020/5/22
   * result: true
   * time: 70%
   * memory usage: 100%
   */
  def defangIPaddr(address: String): String = {
    val sb = new StringBuilder()
    address.foreach(char => {
      if (char == '.') {
        sb.append("[.]")
      } else {
        sb.append(char)
      }
    })
    sb.toString()
  }

}
