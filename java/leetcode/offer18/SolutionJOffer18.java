package leetcode.offer18;

/**
 * @date 2021/3/10
 * @author chenguang
 * @desc 剑指 Offer 18. 删除链表的节点
 *
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点
 */
public class SolutionJOffer18 {

    public static void main(String[] args) {

    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode p = head;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
                break;
            }
            p = p.next;
        }
        return head;
    }

}

class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

}
