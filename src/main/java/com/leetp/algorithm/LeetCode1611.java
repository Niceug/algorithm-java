package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/29
 */
public class LeetCode1611 {

    /**
     * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
     * 返回的长度需要从小到大排列。
     *
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public static int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] arr = new int[k + 1];
        for (int i = 0; i < k; ++i) {
            arr[i] = (k - i) * shorter + i * longer;
        }
        return arr;
    }


    public static void main(String[] args) {
        divingBoard(9, 8436, 28489);
    }
}
