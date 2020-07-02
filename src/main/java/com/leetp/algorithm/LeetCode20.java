package com.leetp.algorithm;

import java.util.Stack;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class LeetCode20 {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char current = s.charAt(i);
            if ('{' == current) {
                stack.push(current);
            } else if ('[' == current) {
                stack.push(current);
            } else if ('(' == current) {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if (c != '(' && current == ')') {
                    return false;
                }
                if (c != '[' && current == ']') {
                    return false;
                }
                if (c != '{' && current == '}') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}
