
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Boundary_traversal.java
 * @author Kritika Srivastava
 * @since July 26, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1#
 */
// { Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= s.length)
                break;
            currVal = s[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            Solution T = new Solution();

            ArrayList<Integer> res = T.printBoundary(root);
            for (Integer num : res)
                System.out.print(num + " ");
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends

// User function Template for Java

// class Node
// {
// int data;
// Node left, right;

// public Node(int d)
// {
// data = d;
// left = right = null;
// }
// }

class Solution {
    ArrayList<Integer> printBoundary(Node node) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(node.data);
        Queue<Node> q = new LinkedList<Node>();
        if (node.left != null) {
            q.add(node.left);
        }
        Stack<Node> st = new Stack<Node>();
        while (!q.isEmpty()) {
            int k = q.size();
            for (int i = 0; i < k; i++) {
                if (i == 0 && (q.peek().left != null || q.peek().right != null)) {
                    a.add(q.peek().data);
                }

                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                q.remove();
            }
        }
        leaf(node, a);
        if (node.right != null) {
            q.add(node.right);
        }
        while (!q.isEmpty()) {
            int k = q.size();
            for (int i = 0; i < k; i++) {
                if (i == (k - 1) && (q.peek().left != null || q.peek().right != null)) {
                    st.push(q.peek());
                }

                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                q.remove();
            }
        }
        while (!st.isEmpty()) {
            a.add(st.pop().data);
        }
        return a;
    }

    static void leaf(Node root, ArrayList<Integer> a) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            a.add(root.data);
        }
        leaf(root.left, a);
        leaf(root.right, a);
    }

}
