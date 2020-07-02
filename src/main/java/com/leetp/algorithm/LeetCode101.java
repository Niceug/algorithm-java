package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/24
 */
public class LeetCode101 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric1(TreeNode root) {
        return check(root, root);
    }

    /**
     * 一个根左右，一个根右左，判断节点值是否一样
     *
     * @param root1
     * @param root2
     * @return
     */
    public boolean check(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return check(root1.left, root2.right) && check(root1.right, root2.left);
    }


    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        if (root.left == null || root.right == null) {
            return false;
        }
        if (root.left.val != root.right.val) {
            return false;
        }
        // 镜像左子树
        mirrorTree(root.left);
        return isEqual(root.left, root.right);
    }

    private static boolean isEqual(TreeNode head1, TreeNode head2) {
        if (head1 == null && head2 == null) {
            return true;
        }
        if (head1 == null || head2 == null) {
            return false;
        }
        if (head1.val != head2.val) {
            return false;
        }
        return isEqual(head1.left, head2.left) && isEqual(head1.right, head2.right);
    }

    private static void mirrorTree(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        mirrorTree(node.left);
        mirrorTree(node.right);
    }

    public static void main(String[] args) {
    }
}
