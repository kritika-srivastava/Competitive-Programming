/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Zigzag_tree_traversal.java
 * @author Kritika Srivastava
 * @since July 26, 2021
 *
 * Link - https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Zigzag_tree_traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> a = new LinkedList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        int x = 0;
        if (root == null) {
            return a;
        }
        s.push(root);
        while (!s.isEmpty() || !st.isEmpty()) {
            a.add(new LinkedList<Integer>());
            int k = 0;
            if (x % 2 == 0) {
                k = s.size();
                for (int i = 0; i < k; i++) {
                    if (s.peek().left != null) {
                        st.push(s.peek().left);
                    }
                    if (s.peek().right != null) {
                        st.push(s.peek().right);
                    }
                    // System.out.println(s.peek().val);
                    a.get(x).add(s.pop().val);
                }
            } else {
                k = st.size();
                for (int i = 0; i < k; i++) {
                    if (st.peek().right != null) {
                        s.push(st.peek().right);
                    }
                    if (st.peek().left != null) {
                        s.push(st.peek().left);
                    }
                    // System.out.println(st.peek().val);
                    a.get(x).add(st.pop().val);
                }
            }
            x++;
        }
        return a;
    }
}