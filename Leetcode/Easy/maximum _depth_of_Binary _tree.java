/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/maximum _depth_of_Binary _tree.java
 * @author Kritika Srivastava
 * @since July 15, 2021
 *
 * Link - https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class maximum_depth_of_Binary_tree
{

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

}
