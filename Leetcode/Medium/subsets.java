
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/subsets.java
 * @author Kritika Srivastava
 * @since June 24, 2021
 *
 * Description - Given an integer array nums of unique elements, return all possible 
 * subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * 
 * Link - https://leetcode.com/problems/subsets/
 */
import java.util.*;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        backtracking(l, new ArrayList<Integer>(), nums, 0);
        return l;
    }

    static void backtracking(List<List<Integer>> l, List<Integer> temp, int nums[], int j) {
        l.add(new ArrayList<>(temp));

        for (int i = j; i < nums.length; i++) {
            if (temp.contains(nums[i])) {
            } else {
                temp.add(nums[i]);
                backtracking(l, temp, nums, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
