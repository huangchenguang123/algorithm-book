package leetcode.m02;

/**
 * date: 2020/5/22
 * param:
 * return:
 * author: chenguang
 * desc: 下一节点复制到当前节点，然后删除下一节点
 */
/**
 * date: 2020/5/22
 * result: true
 * time: 100%
 * memory usage: 100%
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}