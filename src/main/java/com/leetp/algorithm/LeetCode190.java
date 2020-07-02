package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/26
 */
public class LeetCode190 {
    public static int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < 16; ++i) {
            long tmpLow = (n >> i) & 1;
            long tmpHigh = (n >> (31 - i)) & 1;
            if (tmpLow == 0) {
                n &= (~(1 << (31 - i)));
            } else {
                n |= (tmpLow << (31 - i));
            }
            if (tmpHigh == 0) {
                n &= (~(1 << i));
            } else {
                n |= (tmpHigh << i);
            }
        }

        return n;
    }

    public static void main(String[] args) {
        reverseBits(43261596);
    }
}
