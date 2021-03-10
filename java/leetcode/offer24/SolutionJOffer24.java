package leetcode.offer24;

/**
 * @date 2021/3/11
 * @author chenguang
 * @desc 剑指 Offer 24. 反转链表
 *
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class SolutionJOffer24 {

    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}

class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

}