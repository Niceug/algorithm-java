package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/25
 */
public class LeetCode125 {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);
            boolean leftIsNumberOrLetter = isNumberOrLetter(charLeft) || ++left == -1;
            boolean rightIsNumberOrLetter = isNumberOrLetter(charRight) || --right == s.length();

            if (leftIsNumberOrLetter && rightIsNumberOrLetter && (!equalIgnoreCase(charLeft, charRight) || (++left == -1 || --right == s.length()))) {
                return false;
            }
        }
        return true;
    }

    private static boolean equalIgnoreCase(char c1, char c2) {
        if (c1 == c2) {
            return true;
        }
        return c1 >= 65 && c2 >= 65 && Math.abs(c1 - c2) == 32;
    }


    private static boolean isNumberOrLetter(char c) {
        if (c >= 48 && c <= 57) {
            // 数字
            return true;
        }
        if (c >= 65 && c <= 90) {
            return true;
        }
        if (c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean ret = isPalindrome("0P");
        System.out.println(ret);
    }
}
