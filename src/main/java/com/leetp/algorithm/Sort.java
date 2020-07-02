package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/20
 */
public class Sort {

    /**
     * 冒泡排序
     * 左边比右边大则交换
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - 1; ++j) {
                if (arr[j + 1] < arr[j]) {
                    isSorted = false;
                    swap(arr, j, j + 1);
                }
            }
            if (isSorted) {
                break;
            }
        }
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 选择排序
     * 每次选择一个最大的数和一个最小的数，最大的和最后第一个数交换，最小的数和第一个数交换
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int head = 0; head < arr.length; ++head) {
            int tail = arr.length - 1 - head;
            if (head >= tail) {
                break;
            }
            int min = head;
            int max = head;
            for (int j = head; j < arr.length - head; ++j) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // 最小数放到头部
            swap(arr, min, head);
            if (head == max) {
                // min交换位置过了head。所以max现在等于min位置的值
                max = min;
            }
            // 最大数放到尾部
            swap(arr, max, tail);
        }
        print(arr);
    }

    /**
     * 插入排序
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                continue;
            }
            for (int j = i; j > 0; --j) {
                // 后面大于前面则交换
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                } else {
                    break;
                }
            }
        }
        print(arr);
    }

    /**
     * 归并排序非递归实现
     *
     * @param arr
     */
    public static void mergeSortNor(int[] arr) {
        int gap = 2;
        int[] tmp = new int[arr.length];
        while (gap <= arr.length * 2) {
            for (int start = 0; start < arr.length; ) {
                int end = start + gap;
                if (end >= arr.length) {
                    end = arr.length;
                }
                if (start >= end) {
                    break;
                }

                // 求中点
                int center = (end - start) / 2 + start;
                // 这块比较重要
                if (gap > arr.length) {
                    center = gap / 2;
                }

                merge(arr, start, center, end, tmp);
                start = end;
            }
            gap *= 2;
        }
    }

    /**
     * 归并排序
     * 时间复杂度N*logN
     * 空间复杂度N
     *
     * @param arr
     */
    public static void mergeSort(int[] arr) {
        split(arr, 0, arr.length, new int[arr.length]);
    }

    private static void split(int[] arr, int start, int end, int[] tmp) {
        if (start >= end - 1) {
            return;
        }
        int center = (end - start) / 2 + start;

        // 拆分O(logN)
        split(arr, start, center, tmp);
        split(arr, center, end, tmp);
        // 合并 O(N)
        merge(arr, start, center, end, tmp);
    }

    public static void quickSort(int[] arr) {
        doQuickSort(arr, 0, arr.length);
        print(arr);

    }

    // 左闭右开
    public static void doQuickSort(int[] arr, int left, int right) {
        if (right - left < 2) {
            return;
        }
        int mid = polymeric(arr, left, right);
        doQuickSort(arr, left, mid);
        doQuickSort(arr, mid, right);
    }

    /**
     * 聚合法
     * 从左向右找比right
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private static int polymeric(int[] arr, int left, int right) {
        int key = arr[right - 1];
        int curRight = right - 1;
        int curLeft = left;
        for (; curLeft < curRight; ) {
            while (arr[curLeft] <= key && curLeft < curRight) {
                curLeft++;
            }
            while (arr[curRight] >= key && curLeft < curRight) {
                curRight--;
            }

            if (curLeft < curRight) {
                swap(arr, curLeft, curRight);
            }
        }
        swap(arr, curLeft, right - 1);

        return curLeft;
    }

    /**
     * 合并
     *
     * @param arr
     * @param start
     * @param center
     * @param end
     * @param tmp
     */
    private static void merge(int[] arr, int start, int center, int end, int[] tmp) {
        int curRight = center;
        int curTmp = start;
        int curLeft = start;
        // 任意选一个区间循环，因为两个区间长度最多相差1，所以选任意一个都没啥区别
        for (; curLeft < center; ) {
            if (arr[curLeft] <= arr[curRight]) {
                tmp[curTmp++] = arr[curLeft++];
            } else {
                tmp[curTmp++] = arr[curRight++];
                if (curRight >= end) {
                    break;
                }
            }
        }

        if (curTmp < end) {
            // 还没合并完
            int surplusStart;
            int surplusEnd;
            if (curLeft < center) {
                surplusStart = curLeft;
                surplusEnd = center;
            } else {
                surplusStart = curRight;
                surplusEnd = end;
            }

            for (; surplusStart < surplusEnd; ++surplusStart) {
                tmp[curTmp++] = arr[surplusStart];
            }
        }

        // 将合并结果拷贝到原数组中
        for (; start < end; ++start) {
            arr[start] = tmp[start];
        }
        print(arr);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 7, 5, 6, 8, 12, 10, 9, 2, 11};
//        mergeSortNor(arr);
        quickSort(arr);
    }
}
