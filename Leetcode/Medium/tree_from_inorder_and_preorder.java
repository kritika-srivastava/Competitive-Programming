/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/tree_from_inorder_and_preorder.java
 * 
 * @author Kritika Srivastava
 * @since July 15, 2021
 *
 *        Link -
 *        https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class tree_from_inorder_and_preorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = construct(0, 0, inorder.length - 1, preorder, inorder);
        return root;
    }

    static TreeNode construct(int i, int start, int end, int[] preorder, int[] inorder) {

        if (i > inorder.length - 1 || start > end) {
            return null;
        }
        TreeNode root = new TreeNode();
        root.val = preorder[i];
        int j = 0;
        for (j = start; j <= end; j++) {
            if (inorder[j] == preorder[i]) {
                break;
            }
        }
        root.left = construct(i + 1, start, j - 1, preorder, inorder);
        root.right = construct(i + j - start + 1, j + 1, end, preorder, inorder);

        return root;

    }
}
