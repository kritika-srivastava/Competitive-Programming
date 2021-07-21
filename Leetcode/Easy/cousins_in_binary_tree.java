/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/cousins_in_binary_tree.java
 * 
 * @author Kritika Srivastava
 * @since July 21, 2021
 *
 *        Link - https://leetcode.com/problems/cousins-in-binary-tree
 */
public class cousins_in_binary_tree {
    public boolean isCousins(TreeNode root, int x, int y) {
        System.out.println(depth(root, x, 0));
        System.out.println(depth(root, y, 0));
        if (depth(root, x, 0) == depth(root, y, 0) && parent(root, x, null) != parent(root, y, null)) {
            return true;
        }

        return false;
    }

    static int depth(TreeNode root, int n, int depth) {
        if (root == null)
            return 0;
        if (root.val == n)
            return depth;

        // If node is present in left subtree
        int left = depth(root.left, n, depth + 1);
        if (left != 0)
            return left;

        // If node is not present in left subtree
        return depth(root.right, n, depth + 1);

    }

    static TreeNode parent(TreeNode root, int n, TreeNode parent) {
        if (root == null)
            return null;
        if (root.val == n)
            return parent;

        // If node is present in left subtree
        TreeNode left = parent(root.left, n, root);
        if (left != null)
            return left;

        // If node is not present in left subtree
        return parent(root.right, n, root);

    }
}
