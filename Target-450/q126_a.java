
/**
 * C:\Users\kriti\Desktop\DS\Target 450\q126.java
 * @author Kritika Srivastava
 * @since January 18, 2021
 *
 * Reverse a Linked List (iterative)
 * Link - https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1#
 */
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

}

class q126_a {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();

            Node head = new Node(sc.nextInt());
            Node tail = head;

            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            ReverseLL g = new ReverseLL();
            head = g.reverseList(head);
            printList(head);
            t--;
        }
    }
}

class ReverseLL {

    Node reverseList(Node head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        Node n = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return n;
    }
}
