package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/29
 */
public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        int[] arr = new int[k];
        arr[0] = nums[0];
        for (int i = 1; i < k; ++i) {
            arr[i] = nums[i];
            for (int j = i; j > 0; --j) {
                if (arr[j - 1] < arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }

        for (int i = k; i < nums.length; ++i) {
            insert(arr, nums[i]);
        }
        return arr[k - 1];
    }

    private void insert(int[] arr, int value) {
        if (value <= arr[arr.length - 1]) {
            return;
        }
        arr[arr.length - 1] = value;
        for (int i = arr.length - 1; i > 0; --i) {
            if (arr[i - 1] < arr[i]) {
                swap(arr, i, i - 1);
            }
        }
    }

    private void swap(int[] arr, int src, int desc) {
        int tmp = arr[src];
        arr[src] = arr[desc];
        arr[desc] = tmp;
    }

    public static void main(String[] args) {
        LeetCode215 leetCode215 = new LeetCode215();
        leetCode215.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6}, 20);
    }
}
