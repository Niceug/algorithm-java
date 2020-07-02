package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class LeetCode38 {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1);
        StringBuilder stringBuilder = new StringBuilder();
        int max = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                ++max;
            } else {
                stringBuilder.append(max).append(str.charAt(i));
                max = 1;
            }
        }
        return stringBuilder.append(max).append(str.charAt(str.length() - 1)).toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }
}
