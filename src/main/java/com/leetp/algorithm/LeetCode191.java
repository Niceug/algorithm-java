package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/26
 */
public class LeetCode191 {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(Integer.MAX_VALUE - 2));
    }
}
