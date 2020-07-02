package com.leetp.algorithm;

/**
 * @Description 二分查找
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class LeetCode35 {


    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * <p>
     * 你可以假设数组中无重复元素。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (target == nums[i]) {
                return i;
            } else if (target > nums[i] && target < nums[i + 1]) {
                return i + 1;
            }
        }
        if (nums[nums.length - 1] == target) {
            return nums.length - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 2, 3, 5}, 0));
    }
}
