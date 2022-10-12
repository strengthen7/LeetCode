package com.anacmer.learn.leetcode.everyday;

public class D1012ListComponent {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int numComponents(ListNode head, int[] nums) {
        int count = 0;
        while (head.next != null) {
            if (arrContainNum(nums, head.val)) {
                if (!arrContainNum(nums, head.next.val)) {
                    count++;
                }
            }
            head = head.next;
        }
        if (arrContainNum(nums, head.val)) {
            count++;
        }

        return count;
    }

    public boolean arrContainNum(int[] nums, int value) {
        for (int num : nums) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        listNode.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        System.out.println(new D1012ListComponent().numComponents(listNode, new int[]{1, 2, 5, 6}));
    }

}
