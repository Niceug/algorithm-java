package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/25
 */
public class LeetCode160 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) {
            return headA;
        }
        if (headA == null || headB == null) {
            return null;
        }
        // 求链表长度
        ListNode curA = headA;
        int lenA = 1;
        while (curA.next != null) {
            curA = curA.next;
            ++lenA;
        }

        ListNode curB = headB;
        int lenB = 1;
        while (curB.next != null) {
            curB = curB.next;
            ++lenB;
        }
        // 如果尾节点不相等，则两个链表不相交
        if (curA != curB) {
            return null;
        }

        curA = headA;
        curB = headB;
        if (lenA > lenB) {
            while (lenA > lenB) {
                curA = curA.next;
                --lenA;
            }
        }
        if (lenB > lenA) {
            while (lenB > lenA) {
                curB = curB.next;
                --lenB;
            }
        }
        while (curA != curB) {
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }

    public static void main(String[] args) {

    }
}
