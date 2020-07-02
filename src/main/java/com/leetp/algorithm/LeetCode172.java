package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/25
 */
public class LeetCode172 {

    /**
     * 给定一个整数 n，返回 n! 结果尾数中零的数量。
     *
     * @param n
     * @return
     */
    public static int trailingZeroes(int n) {
        int zeroCount = 0;
        // 5的
        while (n > 0) {
            n /= 5;
            zeroCount += n;
        }
        return zeroCount;
    }

    public static void main(String[] args) {

    }
}
