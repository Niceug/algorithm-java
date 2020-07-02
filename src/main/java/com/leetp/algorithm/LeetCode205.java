package com.leetp.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/26
 */
public class LeetCode205 {
    public static boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s.equals(t)) {
            return true;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            Character ct = map.get(s.charAt(i));
            Character cs = map.get(t.charAt(i));
            if (ct == null && cs == null) {
                map.put(s.charAt(i), t.charAt(i));
                map.put(t.charAt(i), s.charAt(i));
            }
            Character notNullC = ct == null ? cs : ct;
            if (!map.get(notNullC).equals(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "aa"));
    }
}
