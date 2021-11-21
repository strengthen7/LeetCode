package cc.iszjq.leetcode;

import cc.iszjq.leetcode.struct.ListNode;

/**
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */

public class LeetCodeQ206 {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        LeetCodeQ206 q206 = new LeetCodeQ206();
        System.out.println(q206.reverseList(n1).toString());
    }

    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        while (head != null) {
            //只要当前节点不为空，取当前节点的值新建一个节点
            //新建节点的子节点为节点本身，从而实现节点值逆序的效果
            result = new ListNode(head.val, result);
            head = head.next;
        }
        return result;
    }

}
