package com.leetp.algorithm;

import com.ltp.test.Util;

import java.util.Scanner;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/29
 */
public class P1164 {

    /**
     * 要求
     * m的方案数，
     * 先要求f(m) = f(m - menu[i])的方案数
     * f(menu[i]) = f(menu[i] - menu[i ~ n])
     *
     * @param menu
     * @return
     */
    private static int getPathCount(int[] menu, int[] dp, int money, int index) {
        if (money == 0) {
            return 1;
        }
        if (money < 0) {
            return 0;
        }
        int count = 0;
        for (int i = index; i < menu.length; ++i) {
            if (dp[i] == 0) {
                dp[i] = 1;
                count += getPathCount(menu, dp, money - menu[i], i);
                dp[i] = 0;
            }
        }
        return count;
    }

    private static int getCount(int[] menu, int m) {
        int max = 0;
        for (int value : menu) {
            max += value;
        }
        if (max == m) {
            return 1;
        }

        int[][] dp = new int[menu.length][menu.length];
        // 初始化第一层
        for (int j = 1; j < menu.length; ++j) {
            dp[0][j] = menu[0] + menu[j];
        }
        for (int i = 0; i < menu.length; ++i) {
            for (int j = 1; j < menu.length; ++j) {
                if (i == j) {
                    dp[j][i] = menu[j];
                } else {
                    dp[j][i] = menu[j] + dp[j - 1][i];
                }
            }
        }
        Util.print(dp);
        int count = 0;
        for (int i = 0; i < menu.length; ++i) {
            for (int j = 0; j < menu.length; ++j) {
                if (dp[i][j] == m) {
                    ++count;
                }
            }
        }
        if (m == dp[0][1]) {
            --count;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] menu = new int[n];
        for (int i = 0; i < n; ++i) {
            menu[i] = scanner.nextInt();
        }
        System.out.print(getPathCount(menu, new int[n + 1], m, 0));
    }
}
