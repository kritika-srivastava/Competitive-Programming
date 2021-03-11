/**
 * Link - https://www.interviewbit.com/problems/max-depth-of-binary-tree/
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Tree_Node {
    public int maxDepth(TreeNode A) {
        if(A==null)
        {return 0;}
        
        int l=0,r=0;
        l+=maxDepth(A.left);
        l++;
        r=maxDepth(A.right);
        r++;
        int ret=Math.max(l,r);
        return ret;
        
    }
}
