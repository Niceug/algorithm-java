package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/26
 */
public class LeetCode198 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Math.max(nums[0], nums[1]);
        int min = nums[0];
        for (int i = 2; i < nums.length; i++) {
            int tmp = max;
            max = Math.max(min + nums[i], max);
            min = tmp;
        }
        return max;
    }

    public int rob1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int first = nums[0];
        int second = nums[1];
        for (int i = 2; i < nums.length; i++) {
            int tmp = second;
            if (first + nums[i] > second) {
                second = first + nums[i];
                first = tmp;
            } else {
                first = second;
            }
        }
        return Math.max(first, second);
    }

    public static void main(String[] args) {

    }
}
