import java.util.*;

public class Binary_Tree {
    static Node root;
    static Node temp;

    static class Node {
        Node left, right;
        int key;

        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    static void insert(int i) {
        Node newNode = new Node(i);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (i < current.key) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }

            }
        }
    }

    static void inorder(Node temp) {
        if (temp == null)
            return;
        inorder(temp.left);
        System.out.println(temp.key + " ");
        inorder(temp.right);
    }

    public static void main(String args[]) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print("Inorder traversal before insertion:");
        inorder(root);

        int key = 12;
        insert(key);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
    }

}