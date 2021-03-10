package leetcode.offer22;

/**
 * @date 2021/3/11
 * @author chenguang
 * @desc 剑指 Offer 18. 删除链表的节点
 *
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 */
public class SolutionJOffer22 {

    public static void main(String[] args) {

    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        while (head != null) {
            if (k > 0) {
                k--;
            } else {
                p = p.next;
            }
            head = head.next;
        }
        return p;
    }

}

class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

}
