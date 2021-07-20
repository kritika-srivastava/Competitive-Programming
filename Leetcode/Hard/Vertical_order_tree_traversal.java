
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Hard/Vertical_order_tree_traversal.java
 * @author Kritika Srivastava
 * @since July 20, 2021
 *
 * Link - https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

public class Vertical_order_tree_traversal {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        level_traverse(map, root);
        // System.out.println(q.size()+" size");
        List<List<Integer>> l = new ArrayList<List<Integer>>();

        List<Integer> m = new ArrayList<Integer>();
        for (int i : map.keySet()) {
            m.add(i);
        }
        Collections.sort(m);
        for (int i : m) {
            List<Integer> ll = new ArrayList<Integer>();
            ll.addAll(map.get(i));
            l.add(ll);
        }
        return l;

    }

    static void level_traverse(HashMap<Integer, List<Integer>> map, TreeNode root) {
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<Pair<TreeNode, Integer>>();
        q.add(new Pair<>(root, 0));
        Pair<TreeNode, Integer> temp;
        while (!q.isEmpty()) {

            int x = q.size();
            HashMap<Integer, List<Integer>> m = new HashMap<Integer, List<Integer>>();
            for (int i = 0; i < x; ++i) {

                temp = q.remove();

                if (m.containsKey(temp.getValue())) {
                    ArrayList<Integer> l = new ArrayList<Integer>();

                    l.addAll(m.get(temp.getValue()));
                    l.add(temp.getKey().val);

                    m.put(temp.getValue(), l);
                } else {

                    ArrayList<Integer> l = new ArrayList<Integer>();

                    l.add(temp.getKey().val);
                    m.put(temp.getValue(), l);
                }

                if (temp.getKey().left != null) {
                    q.add(new Pair<>(temp.getKey().left, temp.getValue() - 1));

                }
                if (temp.getKey().right != null) {
                    q.add(new Pair<>(temp.getKey().right, temp.getValue() + 1));

                }

            }

            for (int i : m.keySet()) {
                if (map.containsKey(i)) {
                    ArrayList<Integer> l = new ArrayList<Integer>();
                    ArrayList<Integer> ll = new ArrayList<Integer>();

                    l.addAll(map.get(i));
                    ll.addAll(m.get(i));
                    Collections.sort(ll);
                    l.addAll(ll);
                    map.put(i, l);
                } else {
                    ArrayList<Integer> l = new ArrayList<Integer>();

                    l.addAll(m.get(i));
                    Collections.sort(l);
                    map.put(i, l);
                }
            }
        }
    }
}
