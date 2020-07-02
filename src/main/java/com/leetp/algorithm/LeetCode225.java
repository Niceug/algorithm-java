package com.leetp.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/26
 */
public class LeetCode225 {

    static class MyStack {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        /**
         * Initialize your data structure here.
         */
        public MyStack() {

        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            if (queue1.size() > 0) {
                queue1.add(x);
            } else {
                queue2.add(x);
            }
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            if (queue1.size() == 0 && queue2.size() == 0) {
                return -1;
            }

            if (queue1.size() > 0) {
                swap(queue1, queue2);
                return queue1.poll();
            } else {
                swap(queue2, queue1);
                return queue2.poll();
            }
        }

        private void swap(Queue<Integer> src, Queue<Integer> desc) {
            while (src.size() > 1) {
                desc.add(src.poll());
            }
        }

        /**
         * Get the top element.
         */
        public int top() {
            if (queue1.size() == 0 && queue2.size() == 0) {
                return -1;
            }

            if (queue1.size() > 0) {
                swap(queue1, queue2);
                int ret = queue1.poll();
                queue2.add(ret);
                return ret;
            } else {
                swap(queue2, queue1);
                int ret = queue2.poll();
                queue1.add(ret);
                return ret;
            }
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return queue2.size() == 0 && queue1.size() == 0;
        }
    }

    public static void main(String[] args) {

    }
}
