package com.leetp.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/26
 */
public class LeetCode202 {

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }


        // 质数
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
