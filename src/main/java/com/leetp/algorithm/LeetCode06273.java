package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/27
 */
public class LeetCode06273 {

    /**
     * 给你一个整数 n 表示某所大学里课程的数目，编号为 1 到 n ，数组 dependencies 中， dependencies[i] = [xi, yi]  表示一个先修课的关系，也就是课程 xi 必须在课程 yi 之前上。同时你还有一个整数 k 。
     * <p>
     * 在一个学期中，你 最多 可以同时上 k 门课，前提是这些课的先修课在之前的学期里已经上过了。
     * <p>
     * 请你返回上完所有课最少需要多少个学期。题目保证一定存在一种上完所有课的方式。
     * <p>
     * <p>
     * n = 4, dependencies = [[2,1],[3,1],[1,4]], k = 2
     *
     * @param n
     * @param dependencies
     * @param k
     * @return
     */
    public static int minNumberOfSemesters(int n, int[][] dependencies, int k) {
        if (dependencies.length == 0) {
            if (n % k == 0) {
                return n / k;
            }
            return n / k + 1;
        }
        int[][] arr = new int[n + 1][n + 1];
        for (int i = 0; i < dependencies.length; i++) {
            arr[dependencies[i][0]][dependencies[i][1]] = 1;
        }
        int count = 0;
        int columnCount = 0;
        for (int i = 1; i < arr.length; ++i) {
            for (int j = 1; j < arr.length; ++j) {
                if (arr[j][i] == 1) {
                    ++columnCount;
                }
            }
            if (columnCount == 0) {
                continue;
            }
            if (columnCount == k) {
                count++;
                columnCount = 0;
            } else if (columnCount > k) {
                count += ((columnCount / k) + 1);
                columnCount = 0;
            }
        }
        if (columnCount != 0) {
            count += ((columnCount / k) + 1);
        }

        if (count > n) {
            return n;
        }

        return count + 1;
    }

    public static void main(String[] args) {
        int[][] dependencies = new int[][]{
                {3, 4},
                {1, 5},
                {4, 2},
                {2, 5},
                {4, 5},
                {1, 2},
                {1, 4}, {3, 1}, {3, 2}, {3, 5}
        };
//        int[][] arr = new int[][]{
//                {0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 1},
//                {0, 1, 0, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0}
//        };
        int a = minNumberOfSemesters(5, dependencies, 3);
        System.out.println(a);
    }
}
