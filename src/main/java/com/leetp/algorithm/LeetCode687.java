package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/29
 */
public class LeetCode687 {
    private static int max = 0;

    public static int longestUnivaluePath(TreeNode root) {
        doLongestUnivaluePath(root);
        return max;
    }

    private static int doLongestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        int leftCount = doLongestUnivaluePath(root.left);
        int rightCount = doLongestUnivaluePath(root.right);
        if (root.left != null && root.val == root.left.val) {
            leftCount += 1;
        } else {
            leftCount = 0;
        }
        if (root.right != null && root.val == root.right.val) {
            rightCount += 1;
        } else {
            rightCount = 0;
        }
        max = Math.max(leftCount + rightCount, max);
        return Math.max(leftCount, rightCount);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(4);
        head.right = new TreeNode(5);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(4);
        head.right.right = new TreeNode(5);
        /*
                [90,69,null,49,89,null,52,null,null,null,null]
                          90
                    69           null
                49     89    null     52
                      89
         */

        System.out.println(longestUnivaluePath(head));
        System.out.println(max);
    }
}
