package com.leetp.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/20
 */
public class NumSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 好的解法1
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        // 将结果，下标放入map中
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null && index != i) {
                return new int[]{i, index};
            }
        }
        return null;
    }

    /**
     * 好的解法2
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        // 将结果，下标放入map中
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null && index != i) {
                return new int[]{index, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
