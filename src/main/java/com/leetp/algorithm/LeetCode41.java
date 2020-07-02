package com.leetp.algorithm;//package com.ltp.test.algorithm;
//
//import java.util.*;
//
///**
// * @Description
// * @Author litianpeng
// * @Date 2020/6/27
// */
//public class LeetCode41 {
//    public static int firstMissingPositive(int[] nums) {
//        for (int i = 0; i < nums.length; ++i) {
//            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
//                int tmp = nums[nums[i] - 1];
//                nums[nums[i] - 1] = nums[i];
//                nums[i] = tmp;
//            }
//        }
//
//        Map<String, Integer> map = new HashMap<>();
//        Collection<Integer> values = map.values();
//        Set<String> set = new HashSet<>();
//        map.forEach((key,value)->{
//            if(set.contains(strs[value]))  {
//                return false;
//            } else {
//                set.add(strs[value]);
//            }
//        });
//
//        for (int i = 0; i < nums.length; ++i) {
//            if (nums[i] != i + 1) {
//                return i + 1;
//            }
//        }
//
//        return nums.length + 1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(firstMissingPositive(new int[]{6, 2, 5, 3, 1, 4}));
//    }
//}
