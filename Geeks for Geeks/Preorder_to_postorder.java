/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Preorder_to_postorder.java
 * @author Kritika Srivastava
 * @since July 13, 2021
 *
 * Description - Create a BST from array.
 * Link - https://practice.geeksforgeeks.org/problems/preorder-to-postorder4423/1
 */

import java.util.*;
import java.io.*;

class Node { 
	int data; 
	Node left, right; 
	Node(int d) { 
		data = d; 
		left = right = null; 
	} 
} 


class Preorder_to_postorder {
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String[] inputline = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputline[0]);
            inputline = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputline[i]);
            }
            
            Node res = constructTree(arr, n);
            printPostorder(res);
            System.out.println();
        }
    }
    
    
    
    
 // } Driver Code Ends
//User function Template for Java


//Function that constructs BST from its preorder traversal.
public static Node constructTree(int pre[], int size) 
{
    if(pre.length==0)
    {
        return null;
    }
    Node root=new Node(pre[0]);
    for(int i=1;i<size;i++)
    {
        Node m=root;
        traverse(m,pre[i]);
    }
    
    return root;
} 

static Node traverse(Node root, int key)
{
    if(root==null)
    {root=new Node(key);
    }
    if(key<root.data)
    {root.left=traverse(root.left,key);}
    else if(root.data<key)
    {
       root.right= traverse(root.right,key);
    }
    return root;
}



// { Driver Code Starts.


public static 	void printInorder(Node node) { 
		if (node == null) { 
			return; 
		} 
		printInorder(node.left); 
		System.out.print(node.data + " "); 
		printInorder(node.right); 
	} 
	
public static 	void printPostorder(Node node) { 
		if (node == null) { 
			return; 
		} 
		printPostorder(node.left); 
		printPostorder(node.right);
		System.out.print(node.data + " "); 
	} 
	
public static 	void printPreorder(Node node) { 
		if (node == null) { 
			return; 
		} 
		System.out.print(node.data + " "); 
		printPreorder(node.left); 
		printPreorder(node.right);
	} 

}  // } Driver Code Ends