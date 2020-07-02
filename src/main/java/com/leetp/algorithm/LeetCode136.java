package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/25
 */
public class LeetCode136 {
    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 2, 1, 2};
        singleNumber(arr);
    }
}
