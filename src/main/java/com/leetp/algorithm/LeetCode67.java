package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/23
 */
public class LeetCode67 {
    /**
     * 给你两个二进制字符串，返回它们的和（用二进制表示）
     *
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        if (a == null || a.equals("")) {
            return b;
        }
        if (b == null || b.equals("")) {
            return a;
        }

        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        char plus = 0;
        StringBuilder str = new StringBuilder();
        for (; aLen >= 0 && bLen >= 0; --aLen, --bLen) {
            char ca = a.charAt(aLen);
            char cb = b.charAt(bLen);
            int sum = calculateCharAdd(ca, cb, plus);
            if (sum > 1) {
                plus = '1';
            } else {
                plus = 0;
            }
            str.insert(0, sum % 2);
        }

        if (a.length() == b.length() && plus == '1') {
            return str.insert(0, 1).toString();
        }
        if (a.length() < b.length()) {
            plus = processSurplus(str, b, bLen, plus);
        } else if (a.length() > b.length()) {
            plus = processSurplus(str, a, aLen, plus);
        }
        if (plus == '1') {
            return str.insert(0, 1).toString();
        }
        return str.toString();
    }

    private static char processSurplus(StringBuilder sb, String str, int len, char plus) {
        for (; len >= 0; --len) {
            char ca = str.charAt(len);
            int sum = calculateCharAdd(ca, (char) 0, plus);
            if (sum > 1) {
                plus = '1';
            } else {
                plus = 0;
            }
            sb.insert(0, sum % 2);
        }
        return plus;
    }

    private static int calculateCharAdd(char a, char b, char c) {
        return getC(a) + getC(b) + getC(c);
    }

    private static int getC(char a) {
        switch (a) {
            case 48:
                return 0;
            case 49:
                return 1;
            case 50:
                return 2;
            case 51:
                return 3;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(addBinary("101111", "10"));
    }
}
