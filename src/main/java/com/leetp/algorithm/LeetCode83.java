package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/23
 */
public class LeetCode83 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode backHead = head;
        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return backHead;
    }

    public static void main(String[] args) {
        ListNode backHead = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, null))));
        System.out.println(backHead);
    }
}
