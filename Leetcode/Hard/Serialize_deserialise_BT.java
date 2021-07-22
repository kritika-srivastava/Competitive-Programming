/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Hard/Serialize_deserialise_BT.java
 * @author Kritika Srivastava
 * @since July 22, 2021
 *
 * Link - https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s = "";
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null) {
            return "";
        }
        q.add(root);
        while (!q.isEmpty()) {
            if (q.peek() == null) {
                s += " null";
                q.remove();
                continue;
            }

            q.add(q.peek().left);
            q.add(q.peek().right);
            s += " " + Integer.toString(q.remove().val);
        }
        // System.out.println(s);
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.trim().split("\\s+");

        if (data.equals("")) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();

        TreeNode root = new TreeNode(Integer.parseInt(s[0].trim()));
        q.add(root);

        for (int i = 1; i < s.length; i++) {
            TreeNode r = q.poll();
            if (!s[i].equals("null")) {
                TreeNode left = new TreeNode(Integer.parseInt(s[i].trim()));
                r.left = left;
                q.add(r.left);
            }
            if (!s[++i].equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(s[i].trim()));
                r.right = right;
                q.add(r.right);
            }
        }

        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));