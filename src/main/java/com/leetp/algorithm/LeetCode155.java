package com.leetp.algorithm;

import java.util.Stack;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/25
 */
public class LeetCode155 {
    static class MinStack {
        Stack<Integer> stack = new Stack<>();
        Stack<int[]> minStack = new Stack<>();

        /**
         * 一个栈用来存最小值，一个栈用来存
         * initialize your data structure here.
         */
        public MinStack() {
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.isEmpty()) {
                minStack.push(new int[]{x, 1});
                return;
            }

            x = Math.min(x, minStack.peek()[0]);
            if (minStack.peek()[0] == x) {
                ++minStack.peek()[1];
            } else {
                minStack.push(new int[]{x, 1});
            }
        }

        public void pop() {
            stack.pop();
            if (minStack.peek()[1] == 1) {
                minStack.pop();
            } else {
                --minStack.peek()[1];
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek()[0];
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
