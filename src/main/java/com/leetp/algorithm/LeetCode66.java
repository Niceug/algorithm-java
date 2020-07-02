package com.leetp.algorithm;

import com.ltp.test.Util;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/23
 */
public class LeetCode66 {
    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        int plus = 1;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] + plus < 10) {
                digits[i] += plus;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] arr = plusOne(new int[]{9});
        Util.print(arr);
    }
}
