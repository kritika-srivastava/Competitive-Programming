package Leetcode.Medium;

import javax.swing.tree.TreeNode;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\BinaryTreeFromPreAndPostOrder.java
 * @author Kritika Srivastava
 * @since February 23, 2025
 *
 * Link: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal
 */

public class BinaryTreeFromPreAndPostOrder {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return treeReconstruction(0, preorder.length - 1, 0, preorder, postorder);
    }

    public TreeNode treeReconstruction(int preLow, int preHigh, int postLow, int[] preorder, int[] postorder) {
        if (preLow > preHigh) {
            return null;
        }

        if (preLow == preHigh) {
            return new TreeNode(preorder[preLow]);
        }

        int leftChild = preorder[preLow + 1];

        int leftSubtreeN = 1;
        while (postorder[postLow + leftSubtreeN - 1] != leftChild) {
            leftSubtreeN++;
        }
        TreeNode root = new TreeNode(preorder[preLow]);

        root.left = treeReconstruction(preLow + 1, preLow + leftSubtreeN, postLow, preorder, postorder);
        root.right = treeReconstruction(preLow + leftSubtreeN + 1, preHigh, postLow + leftSubtreeN, preorder,
                postorder);

        return root;

    }
}
