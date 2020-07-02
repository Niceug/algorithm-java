package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class BinarySearch {
    public static int search(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (key == arr[mid]) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        while (index > 0 && arr[index - 1] == arr[index]) --index;
        return index;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 2, 3, 3, 4}, 0));
    }
}
