/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Day-3/Sorted_arr_to_BST.java
 * 
 * @author Kritika Srivastava
 * @since May 27, 2021
 *
 *        Description - Given an integer array nums where the elements are
 *        sorted in ascending order, convert it to a height-balanced binary
 *        search tree. A height-balanced binary tree is a binary tree in which
 *        the depth of the two subtrees of every node never differs by more than
 *        one.
 * 
 *        Link -
 *        https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */


// Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
class Sorted_arr_to_BST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode();
        int m = nums.length / 2;
        root.val = nums[m];
        int a[] = new int[nums.length / 2];
        int b[] = new int[nums.length - nums.length / 2 - 1];
        for (int i = 0; i < nums.length / 2; i++) {
            a[i] = nums[i];
        }
        for (int i = nums.length / 2 + 1; i < nums.length; i++) {
            b[i - nums.length / 2 - 1] = nums[i];
        }
        root.left = sortedArrayToBST(a);
        root.right = sortedArrayToBST(b);
        return root;

    }
}