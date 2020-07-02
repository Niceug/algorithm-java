package com.leetp.algorithm;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/26
 */
public class LeetCode204 {
    public static int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }
        List<Integer> primesList = new LinkedList<>();
        int count = 1;
        for (int i = 3; i < n; i += 2) {
            if (isPrimeNumber(i, primesList)) {
                primesList.add(i);
                ++count;
            }
        }
        return count;
    }

    private static boolean isPrimeNumber(int number, List<Integer> primesList) {
        int sqrtN = (int) Math.sqrt(number) + 1;
        for (Integer primeNum : primesList) {
            if (primeNum > sqrtN) {
                break;
            }
            if (number % primeNum == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        countPrimes(499979);
    }
}
