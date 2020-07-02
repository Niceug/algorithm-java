package com.leetp.algorithm;

import java.util.ArrayList;

/**
 * @Description 滑动窗口的最大值
 * @Author litianpeng
 * @Date 2020/6/27
 */
public class Window {
    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> ret = new ArrayList<>(num.length - 1);
        for (int i = 0; i < num.length; ) {
            int max = num[i];
            int maxIndex = i;
            for (int j = i + 1; j < i + size && i + size <= num.length; ++j) {
                if (num[j] > max) {
                    max = num[j];
                    maxIndex = j;
                }
            }
            if (maxIndex - size < i) {
                ret.add(max);
            }
            for (int k = 0; k <= maxIndex - size - i; ++k) {
                ret.add(max);
            }
            if (maxIndex == i) {
                ++i;
            } else {
                i = maxIndex;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        maxInWindows(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
    }
}
