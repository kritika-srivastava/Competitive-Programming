package Leetcode.Hard;

import java.util.Stack;

import javax.swing.tree.TreeNode;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\RecoverTreeFromPreorderTraversal.java
 * @author Kritika Srivastava
 * @since February 22, 2025
 *
 * Link: https://leetcode.com/problems/recover-a-tree-from-preorder-traversal
 */

public class RecoverTreeFromPreorderTraversal {
    public TreeNode recoverFromPreorder(String traversal) {

        Stack<TreeNode> nodeStack = new Stack<TreeNode>();

        int index = 0;

        while (index < traversal.length()) {
            int depth = 0;
            while (index < traversal.length() && traversal.charAt(index) == '-') {
                depth++;
                index++;
            }
            int value = 0;
            while (index < traversal.length() && traversal.charAt(index) != '-') {
                value = value * 10 + (traversal.charAt(index) - '0');
                index++;
            }

            TreeNode node = new TreeNode(value);

            while (nodeStack.size() > depth) {
                nodeStack.pop();
            }
            if (!nodeStack.isEmpty()) {
                if (nodeStack.peek().left == null) {
                    nodeStack.peek().left = node;
                } else {
                    nodeStack.peek().right = node;
                }
            }
            nodeStack.push(node);

        }

        while (nodeStack.size() > 1) {
            nodeStack.pop();
        }

        return nodeStack.peek();

    }
}
