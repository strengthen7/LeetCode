package tech.strengthen.learn.leetcode;

import tech.strengthen.learn.leetcode.struct.ListNode;

/**
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */

public class Q21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(6)));
        Q21 q21 = new Q21();
        ListNode listNode = q21.mergeTwoLists(l1, l2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode result = head;
        while (l1 != null && l2 != null) {
            //谁大取谁
            if (l1.val > l2.val) {
                result.next = l2;
                l2 = l2.next;
            } else {
                result.next = l1;
                l1 = l1.next;
            }
            result = result.next;
        }
        //剩余节点直接拼接
        if (l1 != null) {
            result.next = l1;
        }
        if (l2 != null) {
            result.next = l2;
        }
        //返回虚拟头节点之后的节点
        return head.next;
    }

}
