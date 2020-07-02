package com.leetp.algorithm;

import java.util.Scanner;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/29
 */
public class P1928 {

    /**
     * @param cur
     * @param str
     * @return
     */
    private static String unZip(int cur, String str) {
        if (cur >= str.length()) {
            return str;
        }
        if (str.charAt(cur) == ']') {
            // 找到上一个左括号的位置
            int lastLeft = findLastLeftPos(cur, str);
            StringBuilder stringBuilder = new StringBuilder();
            int i;
            for (i = lastLeft + 1; i < str.length(); ++i) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    stringBuilder.append(str.charAt(i) % '0');
                } else {
                    break;
                }
            }
            String ret = getString(Integer.parseInt(stringBuilder.toString()), i, cur, str);
            String prefix = str.substring(0, lastLeft) + ret;
            return unZip(prefix.length(), prefix + str.substring(cur + 1));
        } else {
            return unZip(cur + 1, str);
        }
    }

    private static int findLastLeftPos(int cur, String str) {
        for (int i = cur; i >= 0; --i) {
            if (str.charAt(i) == '[') {
                return i;
            }
        }
        return -1;
    }

    private static String getString(int count, int start, int end, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            stringBuilder.append(str, start, end);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(unZip(0, input));
    }
}
