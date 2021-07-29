/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Tree_lowest_common_ancestor.java
 * @author Kritika Srivastava
 * @since July 28, 2021
 *
 * Program Description
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // LinkedList<TreeNode> l=new LinkedList<TreeNode>();
        return traverse(root, p, q);
    }

    static TreeNode traverse(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p) {
            return root;
        }
        if (root == q) {
            return root;
        }
        TreeNode l1 = traverse(root.left, p, q);
        TreeNode l2 = traverse(root.right, p, q);

        if (l1 != null && l2 != null) {
            return root;
        }
        return (l1 != null ? l1 : l2);
    }
}