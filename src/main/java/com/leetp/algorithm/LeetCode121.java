package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/24
 */
public class LeetCode121 {

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * <p>
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
     * <p>
     * 注意：你不能在买入股票前卖出股票。
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = prices[1] - minPrice;
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(prices[i] - minPrice, maxProfit);
        }
        return Math.max(maxProfit, 0);
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1}));
    }
}
