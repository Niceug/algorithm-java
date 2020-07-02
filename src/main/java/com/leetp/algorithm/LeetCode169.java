package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/25
 */
public class LeetCode169 {
    public int majorityElement(int[] nums) {
        int ret = nums[0];
        // 众数的次数比非众数多出了多少。
        int count = 0;
        for (int num : nums) {
            // 开始计数的时候赋值
            if (count == 0) {
                ret = num;
            }
            if (num == ret) {
                ++count;
            } else {
                --count;
            }
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
