/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Day-3/Pascals_Triangle.java
 * 
 * @author Kritika Srivastava
 * @since May 27, 2021
 *
 *        Description - Given an integer numRows, return the first numRows of
 *        Pascal's triangle. In Pascal's triangle, each number is the sum of the
 *        two numbers directly above it.
 * 
 *        Link - https://leetcode.com/problems/pascals-triangle/
 */
import java.util.*;
public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new LinkedList<List<Integer>>();
        l.add(new ArrayList());
        l.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> ll = new LinkedList<Integer>();
            List<Integer> prev = l.get(i - 1);

            ll.add(1);

            for (int j = 1; j < prev.size(); j++) {
                ll.add(prev.get(j - 1) + prev.get(j));
            }
            ll.add(1);
            l.add(ll);
        }
        return l;
    }
}
