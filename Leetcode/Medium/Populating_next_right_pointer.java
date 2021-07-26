/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Populating_next_right_pointer.java
 * @author Kritika Srivastava
 * @since July 26, 2021
 *
 * Link - https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        if (root == null) {
            return root;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int k = q.size();
            for (int i = 0; i < k; i++) {
                Node m = q.remove();
                if (i == k - 1) {
                    m.next = null;

                } else {
                    m.next = q.peek();
                }
                if (m.left != null) {
                    q.add(m.left);
                }
                if (m.right != null) {
                    q.add(m.right);
                }
            }
        }

        return root;
    }
}