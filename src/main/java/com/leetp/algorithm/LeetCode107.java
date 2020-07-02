package com.leetp.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/24
 */
public class LeetCode107 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 自底向上层次遍历
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>(0);
        }
        List<List<Integer>> ret = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        ret.add(new ArrayList<>());

        int levelCount = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            --levelCount;
            ret.get(0).add(node.val);
            if (levelCount == 0) {
                ret.add(0, new ArrayList<>());
            }

            if (node.left != null) {
                ++levelCount;
                queue.add(node.left);
            }

            if (node.right != null) {
                ++levelCount;
                queue.add(node.right);
            }
        }
        ret.remove(0);
        return ret;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<List<Integer>> list = levelOrderBottom(root);
        System.out.println(list);
    }
}
