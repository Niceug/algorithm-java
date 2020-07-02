package com.leetp.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/29
 */
public class P2437 {

    public static BigInteger getPathCount(BigInteger[] arr, int y) {
        if (y <= 2) {
            return new BigInteger(String.valueOf(y));
        }
        if (arr[y] == null) {
            arr[y] = getPathCount(arr, y - 1).add(getPathCount(arr, y - 2));
        }
        return arr[y];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        BigInteger[] arr = new BigInteger[end - start + 1];
        BigInteger count = getPathCount(arr, end - start);
        System.out.println(count);
    }
}
