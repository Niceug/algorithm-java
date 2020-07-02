package com.leetp.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/28
 */
public class P1255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger ret = getN(n);
        System.out.println(ret);
    }

    public static BigInteger getN(int n) {
        if (n < 3) {
            return new BigInteger(String.valueOf(n));
        }
        BigInteger first = new BigInteger("1");
        BigInteger second = new BigInteger("2");
        BigInteger third = new BigInteger("3");
        for (int i = 3; i <= n; ++i) {
            third = first.add(second);
            first = second;
            second = third;
        }
        return third;
    }
}
