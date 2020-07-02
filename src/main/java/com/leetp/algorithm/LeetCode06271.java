package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/27
 */
public class LeetCode06271 {

    /**
     * 给你两个正整数 n 和 k 。
     * <p>
     * 如果正整数 i 满足 n % i == 0 ，那么我们就说正整数 i 是整数 n 的因子。
     * <p>
     * 考虑整数 n 的所有因子，将它们 升序排列 。请你返回第 k 个因子。如果 n 的因子数少于 k ，请你返回 -1 。
     *
     * @param n
     * @param k
     * @return
     */
    public static int kthFactor(int n, int k) {
        int i = 1;
        for (; i <= n && k > 0; ++i) {
            if (n % i == 0) {
                --k;
            }
        }
        if (k != 0) {
            return -1;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        System.out.println(kthFactor(12, 3));
    }
}
