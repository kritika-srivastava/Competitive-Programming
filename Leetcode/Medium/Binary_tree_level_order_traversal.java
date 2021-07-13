/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Binary_tree_level_order_traversal.java
 * @author Kritika Srivastava
 * @since July 13, 2021
 *
 * Link - 
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

class Binary_tree_level_order_traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> l = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null) {
            return l;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int t = q.size();
            List<Integer> ll = new LinkedList<Integer>();
            while (t-- > 0) {
                if (q.peek() != null) {
                    if (q.peek().left != null) {
                        q.add(q.peek().left);
                    }
                    if (q.peek().right != null) {
                        q.add(q.peek().right);
                    }
                    ll.add(q.peek().val);
                    q.remove();
                }
            }
            l.add(new LinkedList<Integer>(ll));
        }
        return l;

    }
}
// @lc code=end
