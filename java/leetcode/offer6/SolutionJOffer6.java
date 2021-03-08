package leetcode.offer6;

import java.util.Stack;

/**
 * @date 2021/3/4
 * @author chenguang
 * @desc 剑指 Offer 06. 从尾到头打印链表
 *
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class SolutionJOffer6 {

    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] result = new int[stack.size()];
        int i = 0;
        while (stack.size() > 0) {
            result[i] = stack.pop();
            i++;
        }
        return result;
    }

}


class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

}

