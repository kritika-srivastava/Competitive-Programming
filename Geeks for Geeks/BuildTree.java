// { Driver Code Starts
import java.util.*;

class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class BuildTree
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int ino[] = new int[n];
            int pre[] = new int[n];
            for(int i = 0; i < n; i++)
              ino[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              pre[i] = sc.nextInt();
              
            GfG gfg = new GfG(0);
            root = gfg.buildTree(ino, pre, 0, n-1);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}
// } Driver Code Ends


class GfG
{
    public static int preIndex;
    GfG(int ind)
    {
        preIndex = ind;
    }
    
  public static Node buildTree(int ino[], int pre[], int st, int end)
    {
       if(st>end)
          return null;
         
       Node tnode=new Node(pre[preIndex]);preIndex++;
       if(st==end)
          return tnode;
       int in=search(ino,st,end,tnode.data);
       tnode.left=buildTree(ino,pre,st,in-1);
       tnode.right=buildTree(ino,pre,in+1,end);
  
       return tnode;
  
}
static int search(int ino[],int st,int end,int value)
{int i=0;
    for ( i=st;i<=end;i++)
    {
        if(value==ino[i])
        return i;
    }return i;
}
    
}
