
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/permutation2.java
 * @author Kritika Srivastava
 * @since June 24, 2021
 *
 * Description - Given a collection of numbers, nums, that might contain duplicates, 
 * return all possible unique permutations in any order.
 * 
 * Link - https://leetcode.com/problems/permutations-ii/
 */
import java.util.*;

public class permutation2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];
        backtracking(l, new ArrayList<>(), nums, visited);
        return l;
    }

    static void backtracking(List<List<Integer>> l, List<Integer> temp, int[] nums, boolean[] visited) {
        if (temp.size() == nums.length && (!l.contains(temp))) {
            l.add(new ArrayList<>(temp));
        } else if (l.contains(temp)) {
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i]) && visited[i] == true) {
                } else {
                    temp.add(nums[i]);
                    visited[i] = true;
                    backtracking(l, temp, nums, visited);
                    visited[i] = false;
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
}
