package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/23
 */
public class LeetCode58 {

    /**
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
     * <p>
     * 如果不存在最后一个单词，请返回 0 。
     * <p>
     * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0 || s.equals(" ")) {
            return 0;
        }
        int lastSpace = -1;
        boolean hasChar = false;
        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (hasChar) {
                    return lastSpace == -1 ? s.length() - i - 1 : lastSpace - i - 1;
                }
                lastSpace = i;
            } else {
                hasChar = true;
            }
        }
        if (lastSpace == -1) {
            return s.length();
        }
        if (hasChar) {
            return lastSpace;
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }
}
