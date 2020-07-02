package com.leetp.algorithm;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/28
 */
public class P1044 {

    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 1,2,3
        // 1,2
        // 1,2,3,4
        /**
         * 1,2,3
         * 2,1,3
         * 3,2,1
         * 2,3,1
         * 1,3,2
         *
         * 1,2
         * 2,1
         *
         * (n - 1) * (n - 1) + 1
         * 1,2,3,4
         * 4,3,2,1
         * 1,3,2,4
         * 1,4,3,2
         * 1
         */

    }
//
//    private static int getSeqCount(int n) {
//
//    }
}
