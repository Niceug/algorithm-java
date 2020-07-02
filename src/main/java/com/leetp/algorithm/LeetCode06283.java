package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/28
 */
public class LeetCode06283 {

    public static int numSubseq(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            int min = nums[i];
            int max = nums[i];
            for (int j = 0; j < nums.length; ++j) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                if (min + max <= target) {
                    ++count;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }

}
