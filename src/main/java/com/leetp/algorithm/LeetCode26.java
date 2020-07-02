package com.leetp.algorithm;

/**
 * @Description 删除排序数组中的重复项
 * @Author litianpeng
 * @Date 2020/6/22
 */
public class LeetCode26 {


    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }

        if (nums.length < 2) {
            return nums.length;
        }

        // 1,2,2,2,4,4,4,5,6
        // curPost永远指向不重复的一个元素
        int curPost = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[curPost] != nums[i]) {
                ++curPost;
                nums[curPost] = nums[i];
            }
        }
        return curPost + 1;
    }



    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 2, 2, 2, 4, 4, 4, 5, 6});
    }
}
