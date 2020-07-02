package com.leetp.algorithm;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/29
 */
public class P1028 {

    public static int w(long a, long b, long c, int[][][] arr) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        if (a > 20 || b > 20 || c > 20) {
            if (arr[20][20][20] == 0) {
                arr[20][20][20] = w(20, 20, 20, arr);
            }
            return arr[20][20][20];
        }

        int value = arr[(int) a][(int) b][(int) c];
        if (value != 0) {
            return value;
        }
        if (a < b && b < c) {
            value = w(a, b, c - 1, arr) + w(a, b - 1, c - 1, arr) - w(a, b - 1, c, arr);
            arr[(int) a][(int) b][(int) c] = value;
            return value;
        }
        value = w(a - 1, b, c, arr) + w(a - 1, b - 1, c, arr) + w(a - 1, b, c - 1, arr) - w(a - 1, b - 1, c - 1, arr);
        arr[(int) a][(int) b][(int) c] = value;
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(" ");
        List<Long[]> list = new ArrayList<>();
        while (true) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            if (a == -1 && b == -1 && c == -1) {
                break;
            }
            list.add(new Long[]{a, b, c});
        }
        int[][][] arr = new int[21][21][21];
        for (Long[] number : list) {
            System.out.println("w(" + number[0] + ", " + number[1] + ", " + number[2] + ") = " + w(number[0], number[1], number[2], arr));
        }
    }
}
