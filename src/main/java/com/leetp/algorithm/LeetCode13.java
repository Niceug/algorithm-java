package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class LeetCode13 {

    public static int romanToInt(String s) {
        // 哈希map换成switch会快很多
        if (s.length() == 1) {
            return getNumber(s.charAt(0));
        }
        int ret = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int num = getNumber(s.charAt(i));
            int nextNum = getNumber(s.charAt(i + 1));
            if (num < nextNum) {
                ret -= num;
            } else {
                ret += num;
            }
        }

        return ret + getNumber(s.charAt(s.length() - 1));
    }

    public static int getNumber(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IVIII"));
    }
}
