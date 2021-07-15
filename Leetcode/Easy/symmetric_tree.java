
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/symmetric_tree.java
 * @author Kritika Srivastava
 * @since July 15, 2021
 *
 * Link - https://leetcode.com/problems/symmetric-tree/
 */
import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class symmetric_tree {
    public boolean isSymmetric(TreeNode root) {
        return isSimilar(root, root);
    }

    static boolean isSimilar(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null || r2 == null) {
            return false;
        }

        return (r1.val == r2.val) && isSimilar(r1.left, r2.right) && isSimilar(r1.right, r2.left);
    }
}
