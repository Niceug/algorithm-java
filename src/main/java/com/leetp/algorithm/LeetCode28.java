package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class LeetCode28 {

    public static int kmp(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null || haystack.length() == 0) {
            return -1;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }

        char first = needle.charAt(0);

        int firstMatch = 0;
        for (; firstMatch < haystack.length() && haystack.charAt(firstMatch) != first; ++firstMatch) ;

        if (haystack.length() - firstMatch < needle.length()) {
            return -1;
        }

        for (int i = firstMatch; i < haystack.length(); ++i) {
            int index = i;
            int start = i;
            if (haystack.length() - start < needle.length()) {
                return -1;
            }
            for (int j = 0; j < needle.length(); ++j) {
                if (haystack.charAt(start++) != needle.charAt(j)) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                return index;
            }
        }
        return -1;

    }

    /**
     * java的indexOf函数
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null || haystack.length() == 0) {
            return -1;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        char first = needle.charAt(0);

        int firstMatch = 0;
        for (; firstMatch < haystack.length() && haystack.charAt(firstMatch) != first; ++firstMatch) ;

        if (haystack.length() - firstMatch < needle.length()) {
            return -1;
        }
        for (int i = firstMatch; i < haystack.length(); ++i) {
            int index = i;
            int start = i;
            if (haystack.length() - start < needle.length()) {
                return -1;
            }
            for (int j = 0; j < needle.length(); ++j) {
                if (haystack.charAt(start++) != needle.charAt(j)) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }
}
