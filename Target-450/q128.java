/**
 * C:\Users\kriti\Desktop\Target 450\q128.java
 * @author Kritika Srivastava
 * @since November 19, 2020
 *
 * Detect a loop in linkedlist
 * Link - https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1#
 */
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class q128
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //test case
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            if( x.detectLoop(head) )
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
// } Driver Code Ends


/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    public static boolean detectLoop(Node head){
        HashSet<Node> a = new HashSet<Node>();
        while(head!=null)
        {
            if(a.contains(head)==true)
            {
                return true;
            }
            else
            {
                
            }
            a.add(head);
            head=head.next;
        }
        return false;
    }
}