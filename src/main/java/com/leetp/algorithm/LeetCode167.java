package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/25
 */
public class LeetCode167 {

    /**
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     * <p>
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                --right;
            } else if (sum < target) {
                ++left;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
