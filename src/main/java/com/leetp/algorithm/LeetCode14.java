package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class LeetCode14 {

    /**
     * 只需要一次遍历
     * 1和2求公共前缀，将公共前缀再和3求公共前缀，以此类推。比传统解法快多了
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String current = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            current = getCommonPrefix(current, strs[i]);
            if ("".equals(current)) {
                return "";
            }
        }
        return current;
    }

    private static String getCommonPrefix(String str1, String str2) {
        for (int i = 1; i <= str1.length(); ++i) {
            if (!str2.startsWith(str1.substring(0, i))) {
                return str1.substring(0, i - 1);
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"13", "1", "1399"}));
    }
}
