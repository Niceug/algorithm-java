package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class LeetCode7 {
    public static int reverse(int x) {
        int ret = 0;
        int max = Integer.MAX_VALUE / 10;
        int min = Integer.MIN_VALUE / 10;
        while (x != 0) {
            int residue = x % 10;
            if (ret > max || (ret == max && residue > 7)) {
                return 0;
            }
            if (ret < min || (ret == min && residue < -8)) {
                return 0;
            }
            ret = 10 * ret + residue;
            x /= 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
