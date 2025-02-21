package Leetcode.Medium;

import javax.swing.tree.TreeNode;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\ElementsInContaminatedBinaryTree.java
 * @author Kritika Srivastava
 * @since February 21, 2025
 *
 * Link: https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
 */
public class ElementsInContaminatedBinaryTree {
    /*
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    TreeNode root;

    public ElementsInContaminatedBinaryTree(TreeNode root) {
        this.root = root;
        this.root.val = 0;

        traverseTree(this.root);

    }

    static void traverseTree(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            root.left.val = 2 * root.val + 1;
        }

        if (root.right != null) {
            root.right.val = 2 * root.val + 2;
        }

        traverseTree(root.left);
        traverseTree(root.right);
    }

    public boolean find(int target) {
        return findTarget(root, target);
    }

    static boolean findTarget(TreeNode root, int target) {
        if (root == null) {
            return false;
        }

        if (root.val == target) {
            return true;
        }

        return findTarget(root.left, target) || findTarget(root.right, target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
