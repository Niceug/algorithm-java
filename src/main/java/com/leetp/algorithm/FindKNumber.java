package com.leetp.algorithm;

/**
 * @Description 找到数组中第k大的数
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class FindKNumber {
    public static int findKNumber(int[] arr, int k) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = getMid(arr, left, right);
            if (mid == k - 1) {
                return arr[mid];
            }
            if (mid > k - 1) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return -1;
    }

    /**
     * 获取当前数字排序后的位置
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int getMid(int[] arr, int left, int right) {
        int key = arr[right - 1];
        int curLeft = left;
        int curRight = right - 1;
        while (curLeft < curRight) {
            while (arr[curLeft] >= key && curLeft < curRight) {
                ++curLeft;
            }
            while (arr[curRight] <= key && curLeft < curRight) {
                --curRight;
            }
            if (curLeft < curRight) {
                swap(arr, curLeft, curRight);
            }
        }
        swap(arr, curLeft, right - 1);
        return curLeft;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, 2, 5, 7, 4, 7};
        int a = findKNumber(arr, 3);
        System.out.println(a);
    }
}
