package com.leetp.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/24
 */
public class LeetCode120 {

    /**
     * 动态规划空间优化
     *
     * @param triangle
     * @return
     */
    public static int minimumTotalIteratorSpaceBetter(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int row = triangle.size();
        int column = triangle.get(row - 1).size();

        int[] dp = new int[column];
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < row; ++i) {
            int tmp1 = dp[i - 1];
            int tmp0 = dp[0];
            for (int j = 0; j < triangle.get(i).size() - 1; ++j) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
            // 对首尾进行特殊处理
            dp[i] = triangle.get(i).get(i) + tmp1;
            dp[0] = triangle.get(i).get(0) + tmp0;
        }

        int ret = dp[0];
        for (int i = 1; i < column; i++) {
            ret = Math.min(ret, dp[i]);
        }
        return ret;
    }

    /**
     * 动态规划解法
     *
     * @param triangle
     * @return
     */
    public static int minimumTotalIterator(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }

        int row = triangle.size();
        int column = triangle.get(row - 1).size();

        int[][] dp = new int[row][column];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < row; ++i) {
            // 对首尾进行特殊处理
            dp[i][i] = triangle.get(i).get(i) + dp[i - 1][i - 1];
            dp[i][0] = triangle.get(i).get(0) + dp[i - 1][0];
            for (int j = 1; j < i; ++j) {
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
            }
        }

        int ret = dp[row - 1][0];
        for (int i = 1; i < column; i++) {
            ret = Math.min(ret, dp[row - 1][i]);
        }
        return ret;
    }

    /**
     * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
     * <p>
     * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
     *
     * @param triangle
     * @return
     */
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        return getMinimum(triangle, 0, 0);
    }

    public static int getMinimum(List<List<Integer>> triangle, int indexI, int indexJ) {
        if (indexJ >= triangle.get(indexI).size()) {
            return 0;
        }
        if (indexI == triangle.size() - 1) {
            return triangle.get(indexI).get(indexJ);
        }

        int left = triangle.get(indexI).get(indexJ) + getMinimum(triangle, indexI + 1, indexJ);
        int right = triangle.get(indexI).get(indexJ) + getMinimum(triangle, indexI + 1, indexJ + 1);
        return Math.min(left, right);
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        int i = minimumTotalIteratorSpaceBetter(lists);
        System.out.println(i);
    }
}
