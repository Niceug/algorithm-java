package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class LeetCode9 {
    public static boolean isPalindrome(int x) {
        if (x >= 0 && x < 10) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int ret = 0;
        // 只翻转一半的数字，然后和另一半对比
        while (x > ret) {
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        // 可能存在长度为奇数的情况。所以需要/10，忽略掉这一位
        return ret == x || ret / 10 == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(102));
    }
}
