
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/inOrderTraversal.java
 * @author Kritika Srivastava
 * @since July 15, 2021
 *
 * Link - https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class inOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if (root == null) {
            return l;
        }

        l.addAll(inorderTraversal(root.left));
        l.add(root.val);
        l.addAll(inorderTraversal(root.right));

        return l;

    }
}
// @lc code=end
