package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/24
 */
public class LeetCode122 {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int maxProfit = prices[1] - prices[0];
        int minPrice = prices[0];
        int currentMinPrice = prices[0];
        for (int i = 1; i < prices.length - 1; ++i) {
            minPrice = Math.min(prices[i], minPrice);
            currentMinPrice = Math.min(currentMinPrice, prices[i]);
            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
                currentMinPrice = prices[i + 1];
            } else {
                maxProfit += prices[i] - currentMinPrice;
            }
        }
        return Math.max(maxProfit, 0);
    }

    public static void main(String[] args) {
        maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }
}
