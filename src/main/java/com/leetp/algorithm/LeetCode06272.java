package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/27
 */
public class LeetCode06272 {

    /**
     * 给你一个二进制数组 nums ，你需要从中删掉一个元素。
     * <p>
     * 请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。
     * <p>
     * 如果不存在这样的子数组，请返回 0 。
     *
     * @param nums
     * @return
     */
    public static int longestSubarray(int[] nums) {
        int maxLen = 0;
        int len = 0;
        int i = 0;
        for (; i < nums.length; ++i) {
            if (nums[i] != 0) {
                break;
            }
        }
        if (nums.length == i) {
            return 0;
        }

        int last = len;
        for (; i < nums.length; ++i) {
            if (nums[i] == 1) {
                ++len;
                continue;
            }
            maxLen = Math.max(last + len, maxLen);
            last = len;
            len = 0;
        }
        if (len == nums.length) {
            return len - 1;
        }
        return Math.max(last + len, maxLen);
    }

    public static void main(String[] args) {
        longestSubarray(new int[]{1,1,0,0,1,1,1,0,1});
    }
}
