import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}

class Swap {
    static Node head;
    static Node last;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);

            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }

            GfG gfg = new GfG();
            head = gfg.pairwiseSwap(head);
            printList(head);
            System.out.println();
            t--;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            last=head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;
            last.next = node;
            last=last.next;
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
class GfG {
    public static Node pairwiseSwap(Node node) {
         if(node!=null&&node.next!=null)
        {
            int k=node.data;
            node.data=node.next.data;
            node.next.data=k;
            pairwiseSwap(node.next.next);
        }
        return node;
    }
}
