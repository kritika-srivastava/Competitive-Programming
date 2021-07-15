/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/invert_a_binary_tree.java
 * 
 * @author Kritika Srivastava
 * @since July 15, 2021
 *
 *        Link - https://leetcode.com/problems/invert-binary-tree/
 */
public class invert_a_binary_tree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;

        return root;
    }
}
