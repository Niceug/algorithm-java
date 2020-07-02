package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/23
 */
public class LeetCode69 {

    /**
     * 实现 int sqrt(int x) 函数。
     *
     * <p>
     * i * 2 + 1
     * 3,5,7,9,11,13,
     * 1，4，9，16，25，36，49，64
     * 计算并返回 x 的平方根，其中 x 是非负整数。
     * <p>
     * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
     *
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        }

        for (int i = 0; i < x; ++i) {
            if (i * i == x) {
                return i;
            } else if (x - i * i < i * 2 + 1) {
                return i;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
