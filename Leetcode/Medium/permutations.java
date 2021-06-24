
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/permutations.java
 * @author Kritika Srivastava
 * @since June 24, 2021
 *
 * Description - Given an array nums of distinct integers, return all the possible 
 * permutations. You can return the answer in any order.
 * 
 * Link - https://leetcode.com/problems/permutations/
 */
import java.util.*;

public class permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        backtracking(l, new ArrayList<>(), nums);
        return l;
    }

    static void backtracking(List<List<Integer>> l, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            l.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i])) {
                } else {
                    temp.add(nums[i]);
                    backtracking(l, temp, nums);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
}
