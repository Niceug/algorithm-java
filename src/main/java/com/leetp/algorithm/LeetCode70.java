package com.leetp.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/23
 */
public class LeetCode70 {

    static Map<Integer, Integer> map = new HashMap<>();

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * <p>
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * <p>
     * 注意：给定 n 是一个正整数。
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        Integer val = map.get(n);
        if (val != null) {
            return val;
        }
        map.put(n - 1, climbStairs(n - 1));
        map.put(n - 2, climbStairs(n - 2));
        return map.get(n - 1) + map.get(n - 2);
    }

    public static int climbStairs1(int n) {
        if (n < 3) {
            return n;
        }
        int first = 1;
        int second = 2;
        int third = 3;
        for (int i = 3; i <= n; ++i) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs1(45));
    }
}
