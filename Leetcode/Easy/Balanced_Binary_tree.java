/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/Balanced_Binary_tree.java
 * @author Kritika Srivastava
 * @since July 26, 2021
 *
 * Link - https://leetcode.com/problems/balanced-binary-tree/
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    static boolean a = true;

    public boolean isBalanced(TreeNode root) {
        traverse(root);
        boolean ret = a;
        a = true;
        return ret;
    }

    static int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int m = traverse(root.left);
        int n = traverse(root.right);
        if (Math.abs(m - n) > 1) {
            a = false;
        }
        // System.out.println(a);
        return Math.max(m, n) + 1;
    }
}