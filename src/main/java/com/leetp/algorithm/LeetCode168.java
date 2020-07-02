package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/25
 */
public class LeetCode168 {

    /**
     * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
     *
     * @param n
     * @return
     */
    public static String convertToTitle(int n) {
        int hex26 = 26;
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            int tmp = n % (hex26);
            tmp = tmp == 0 ? 26 : tmp;
            n /= hex26;
            if (tmp == 26) {
                n -= 1;
            }
            stringBuilder.insert(0, (char) (tmp + 64));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }
}
