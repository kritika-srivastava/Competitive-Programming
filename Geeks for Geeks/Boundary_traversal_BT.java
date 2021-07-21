
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

public class Boundary_traversal_BT {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
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
        ArrayList<Node> a = new ArrayList<Node>();
        ArrayList<Node> leaf = new ArrayList<Node>();
        Stack<Node> st = new Stack<Node>();
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (node == null) {
            return ret;
        }

        q.add(node);

        while (!q.isEmpty()) {
            int k = q.size();
            for (int i = 1; i <= k; i++) {
                if (i == 1) {
                    a.add(q.peek());
                }

                if (i == k) {
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
        leafT(node, leaf);
        for (Node n : leaf) {
            if (!a.contains(n)) {
                a.add(n);
            }
        }

        while (!st.isEmpty()) {
            if (!a.contains(st.peek())) {
                a.add(st.pop());
            }
        }

        for (Node n : a) {
            ret.add(n.data);
        }

        return ret;
    }

    static void leafT(Node node, ArrayList<Node> leaf) {
        if (node == null) {
            return;
        }
        leafT(node.left, leaf);

        if (node.left == null && node.right == null) {
            leaf.add(node);
        }
        leafT(node.right, leaf);
    }

}
