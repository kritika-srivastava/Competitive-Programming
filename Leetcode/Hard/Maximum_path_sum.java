/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Hard/Maximum_path_sum.java
 * @author Kritika Srivastava
 * @since July 26, 2021
 *
 * Link - https://leetcode.com/problems/binary-tree-maximum-path-sum/
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    static int a;

    public int maxPathSum(TreeNode root) {
        a = Integer.MIN_VALUE;
        traverse(root);
        return a;
    }

    static int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int m = Math.max(0, traverse(root.left));
        int n = Math.max(0, traverse(root.right));
        a = Math.max(a, m + n + root.val);

        return Math.max(m, n) + root.val;
    }
}