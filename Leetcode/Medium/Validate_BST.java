/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Validate_BST.java
 * @author Kritika Srivastava
 * @since July 26, 2021
 *
 * Link - https://leetcode.com/problems/validate-binary-search-tree/
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        inorder(root, l);
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) >= l.get(i + 1)) {
                return false;
            }
        }

        return true;

    }

    static void inorder(TreeNode root, LinkedList<Integer> l) {
        if (root == null) {
            return;
        }
        inorder(root.left, l);
        l.add(root.val);
        inorder(root.right, l);
    }
}