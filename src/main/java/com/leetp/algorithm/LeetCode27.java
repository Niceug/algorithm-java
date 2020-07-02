package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class LeetCode27 {
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // 总是指向需要删除的数字
        int validCur = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                swap(nums, validCur, i);
                ++validCur;
            } else {
                if (i > 0) {
                    if (nums[i - 1] != val) {
                        validCur = i;
                    }
                }
            }
        }
        return validCur;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }
}
