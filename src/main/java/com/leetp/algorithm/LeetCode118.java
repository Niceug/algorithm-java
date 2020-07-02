package com.leetp.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/24
 */
public class LeetCode118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        if (numRows == 0) {
            return list;
        }

        for (int i = 0; i < numRows; ++i) {
            List<Integer> itemList = new ArrayList<>(i);
            list.add(itemList);
            int index = i - 1;
            for (int j = 0; j <= i; ++j) {
                if (j == i || j == 0) {
                    itemList.add(1);
                } else {
                    itemList.add(list.get(index).get(j - 1) + list.get(index).get(j));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
        System.out.println(generate);
    }
}
