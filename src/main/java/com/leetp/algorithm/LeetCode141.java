package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/25
 */
public class LeetCode141 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 给定一个链表，判断链表中是否有环。
     * <p>
     * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
     *
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fastCur = head;
        ListNode slowCur = head;
        while (fastCur != null && fastCur.next != null) {
            fastCur = fastCur.next.next;
            slowCur = slowCur.next;
            if (fastCur == slowCur) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode tmp = listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(-4);
        listNode.next.next.next.next = tmp;
        hasCycle(listNode);
    }
}
