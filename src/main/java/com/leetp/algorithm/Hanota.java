package com.leetp.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/29
 */
public class Hanota {

    public static void hanota(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (A.size() == 0 && B.size() == 0) {
            return;
        }
        if (n == 1) {
            C.add(A.get(A.size() - 1)); // 将数字最小的圆盘从A搬移到C
            A.remove(A.size() - 1);
            return;
        }
        // A的将n - 1个圆盘，借助C搬移到B
        hanota(n - 1, A, C, B);

        // 将第N-2个圆盘，从A，搬移到C
        C.add(A.get(A.size() - 1));
        A.remove(A.size() - 1);

        // 将B上的N-1个圆盘借助空A搬移到C
        hanota(n - 1, B, A, C);
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(4);
        A.add(3);
        A.add(2);
        A.add(1);
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        hanota(A.size(), A, B, C);
        System.out.println();
    }
}
