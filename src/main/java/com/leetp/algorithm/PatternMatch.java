package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/20
 */
public class PatternMatch {
    public boolean isMatch(String s, String p) {
        if (".*".equals(p)) {
            return true;
        }

        char[] chars = s.toCharArray();
        char[] ps = s.toCharArray();

        if (ps[0] == '*') {
            return false;
        }

        char previousC = chars[0];
        for (int i = 0; i < chars.length; i++) {
            if (ps[i] == '.' || chars[i] == ps[i]) {
                continue;
            }
            // 如果当前匹配
            if (ps[i] == '*') {
                if (previousC != chars[i]) {
                    return false;
                }
            }
            // 记录之前的一个字符
            previousC = chars[i];
        }
        return true;
    }

    public static void main(String[] args) {
        new PatternMatch().isMatch("aa", "a");
    }
}
