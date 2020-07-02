package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/27
 */
public class LeetCode0628 {
    public static double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        double sum = salary[0];
        for (int i = 1; i < salary.length; ++i) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
            sum += salary[i];
        }
        sum -= min;
        sum -= max;
        return sum / (salary.length - 2);
    }

    public static void main(String[] args) {
        double a = average(new int[] {1000,2000,3000});
        System.out.println(a);
    }
}
