/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/Diameter_of_Binary_Tree.java
 * @author Kritika Srivastava
 * @since July 26, 2021
 *
 * Link - https://leetcode.com/problems/diameter-of-binary-tree/
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    static int a = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        traverse(root);
        int ret = a;
        a = 0;
        return ret;
    }

    static int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int m = traverse(root.left);
        int n = traverse(root.right);
        a = Math.max(a, m + n);
        // System.out.println(a);
        return Math.max(m, n) + 1;
    }

}