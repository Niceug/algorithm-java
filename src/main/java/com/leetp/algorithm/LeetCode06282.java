package com.leetp.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/28
 */
public class LeetCode06282 {

    public static boolean canArrange(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum % k == 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(LeetCode06282.class.getClassLoader().getResource("a.txt").getPath())));
        char[] buffer = new char[10240];
        StringBuilder stringBuilder = new StringBuilder();
        while (bufferedReader.read(buffer) != -1) {
            stringBuilder.append(String.valueOf(buffer));
        }
        String[] str = stringBuilder.toString().split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Integer.parseInt(str[i]);
        }
        canArrange(arr, 100000);
    }

}
