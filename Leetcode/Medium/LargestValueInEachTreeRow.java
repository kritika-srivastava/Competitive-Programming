package Leetcode.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\LargestValueInEachTreeRow.java
 * @author Kritika Srivastava
 * @since December 25, 2024
 *
 * Link: https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
 */
public class LargestValueInEachTreeRow {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    public List<Integer> largestValues(TreeNode root) {

        Queue<TreeNode> stage1 = new LinkedList<>();
        Queue<TreeNode> stage2 = new LinkedList<>();
        List<Integer> ans = new LinkedList<>();

        if (root == null) {
            return ans;
        }
        stage1.add(root);
        boolean flag = true;
        while (!stage1.isEmpty() || !stage2.isEmpty()) {
            int max = Integer.MIN_VALUE;
            if (flag) {
                while (!stage1.isEmpty()) {
                    TreeNode temp = stage1.poll();
                    max = Math.max(max, temp.val);

                    if (temp.left != null) {
                        stage2.add(temp.left);
                    }
                    if (temp.right != null) {
                        stage2.add(temp.right);
                    }
                }
                flag = false;
            } else {
                while (!stage2.isEmpty()) {
                    TreeNode temp = stage2.poll();
                    max = Math.max(max, temp.val);

                    if (temp.left != null) {
                        stage1.add(temp.left);
                    }
                    if (temp.right != null) {
                        stage1.add(temp.right);
                    }
                }
                flag = true;
            }

            ans.add(max);
        }

        return ans;

    }
}
