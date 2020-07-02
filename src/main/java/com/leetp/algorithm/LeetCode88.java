package com.leetp.algorithm;


/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/23
 */
public class LeetCode88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mergeLen = m + n;
        for (int i = m; i < mergeLen; ++i) {
            nums1[i] = nums2[i - m];
        }

        int i = 0;
        int j = m;
        for (; i < m && j < mergeLen; ) {
            if (nums1[i] <= nums1[j]) {
                ++i;
            } else {
                swap(nums1, i, j);
                // 对nums2进行重排序
                for (int k = j; k < mergeLen - 1; ++k) {
                    if (nums1[k] > nums1[k + 1]) {
                        swap(nums1, k, k + 1);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void mergeV1(int[] nums1, int m, int[] nums2, int n) {
        int maxLen = m + n;
        while (n > 0)
            nums1[--maxLen] = (m > 0 && nums1[m - 1] > nums2[n - 1]) ? nums1[--m] : nums2[--n];
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        merge(new int[]{5, 16, 20, 0, 0, 0}, 3, new int[]{5, 15, 21}, 3);
    }
}
