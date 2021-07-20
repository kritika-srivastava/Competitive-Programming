/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/sum_root_to_leaf_node.java
 * @author Kritika Srivastava
 * @since July 20, 2021
 *
 * Link - https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class sum_root_to_leaf_node {
    public int sumNumbers(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if (root == null) {
            return 0;
        }
        int val = 0;
        traverse(l, root, val);
        int sum = 0;
        for (int i = 0; i < l.size(); i++) {
            sum += l.get(i);
        }
        return sum;

    }

    static void traverse(List<Integer> l, TreeNode root, int val) {
        if (root.left == null && root.right == null) {
            val = val * 10 + root.val;
            // System.out.println(val+" Val");
            l.add(val);
            return;

        }
        val = val * 10 + root.val;
        if (root.left != null) {
            traverse(l, root.left, val);
        }
        if (root.right != null) {
            traverse(l, root.right, val);
        }

    }
}