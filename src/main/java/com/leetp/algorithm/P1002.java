package com.leetp.algorithm;


import java.util.Scanner;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/28
 */
public class P1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        int bY = scanner.nextInt();
        int bX = scanner.nextInt();
        int horseY = scanner.nextInt();
        int horseX = scanner.nextInt();
        int[][] arr = new int[bY + 1][bX + 1];
        // 计算出所有马能达到的点
        // 马的位置标记为1，行走的路线标记为2，未行走
        fillHorsePosition(arr, horseY, horseX);
        // 深度优先
        int ret = getPath(arr, 0, 0);
        print(arr);
        System.out.println(ret);
    }

    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }

    private static int getPath(int[][] arr, int curY, int curX) {
        int maxX = arr[0].length;
        int maxY = arr.length;
        if (curY >= maxY || curY < 0) {
            return 0;
        }
        if (curX >= maxX || curX < 0) {
            return 0;
        }
        if (arr[curY][curX] == 1) {
            return 0;
        }
        if (arr[curY][curX] == 2) {
            return 0;
        }
        if (curX == maxX - 1 && curY == maxY - 1) {
            return 1;
        }
        print(arr);
        arr[curY][curX] = 2;
        int down = getPath(arr, curY + 1, curX);
        int right = getPath(arr, curY, curX + 1);
        arr[curY][curX] = 0;
        return down + right;
    }

    private static void fillHorsePosition(int[][] arr, int horseY, int horseX) {
        int maxX = arr[0].length;
        int maxY = arr.length;
        arr[horseY][horseX] = 1;
        if (horseY - 1 >= 0 && horseX - 2 >= 0) {
            arr[horseY - 1][horseX - 2] = 1;
        }
        if (horseY - 2 >= 0 && horseX - 1 >= 0) {
            arr[horseY - 2][horseX - 1] = 1;
        }
        if (horseY - 2 >= 0 && horseX + 1 < maxX) {
            arr[horseY - 2][horseX + 1] = 1;
        }
        if (horseY - 1 >= 0 && horseX + 2 < maxX) {
            arr[horseY - 1][horseX + 2] = 1;
        }


        if (horseY + 1 < maxY && horseX - 2 >= 0) {
            arr[horseY + 1][horseX - 2] = 1;
        }
        if (horseY + 2 < maxY && horseX - 1 >= 0) {
            arr[horseY + 2][horseX - 1] = 1;
        }
        if (horseY + 2 < maxY && horseX + 1 < maxX) {
            arr[horseY + 2][horseX + 1] = 1;
        }
        if (horseY + 1 < maxY && horseX + 2 < maxX) {
            arr[horseY + 1][horseX + 2] = 1;
        }

    }
}
