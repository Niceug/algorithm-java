package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/25
 */
public class LeetCode171 {
    public static int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int ret = 0;
        int hex = 1;
        for (int i = s.length() - 1; i >= 0; --i) {
            ret += ((s.charAt(i) - 'A' + 1) * hex);
            hex *= 26;
        }
        return ret;
    }

    public static void main(String[] args) {
        int a = titleToNumber("AAA");
        System.out.println(a);
    }
}
