/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/preorderTraversal.java
 * @author Kritika Srivastava
 * @since July 15, 2021
 *
 * Link - https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if (root == null) {
            return l;
        }
        l.add(root.val);
        l.addAll(preorderTraversal(root.left));
        l.addAll(preorderTraversal(root.right));
        return l;

    }
}
// @lc code=end
