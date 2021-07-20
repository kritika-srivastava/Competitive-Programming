/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Tree_top_view.java
 * @author Kritika Srivastava
 * @since July 20, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
 */
// { Driver Code Starts
//Initial Template for JAVA

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Tree_top_view {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            ArrayList<Integer> vec = topView(root);
            for (int x : vec)
                System.out.print(x + " ");
            System.out.println();

            t--;
        }
    }

    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Queue<KeyValue<Node, Integer>> q = new LinkedList<KeyValue<Node, Integer>>();
        if (root == null) {
            return l;
        }
        q.add(new KeyValue<>(root, 0));

        while (!q.isEmpty()) {
            KeyValue<Node, Integer> m = q.poll();
            if (!map.containsKey(m.getKey())) {
                map.put(m.getValue(), m.getKey().data);
            } else {
            }
            if (m.getKey().left != null) {
                q.add(new KeyValue<>(m.getKey().left, m.getValue() - 1));
            }
            if (m.getKey().right != null) {
                q.add(new KeyValue<>(m.getKey().right, m.getValue() + 1));
            }
        }

        ArrayList<Integer> m = new ArrayList<Integer>();
        for (int i : map.keySet()) {
            m.add(i);
        }
        Collections.sort(m);
        for (int i : m) {
            l.add(map.get(i));
        }
        return l;
    }// } Driver Code Ends

    // User function Template for Java

class KeyValue<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public K setKey(K key) {
        return this.key = key;
    }

    public V setValue(V value) {
        return this.value = value;
    }
}
