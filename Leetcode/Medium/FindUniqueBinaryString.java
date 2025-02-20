package Leetcode.Medium;

import java.util.ArrayList;
import java.util.List;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\FindUniqueBinaryString.java
 * @author Kritika Srivastava
 * @since February 20, 2025
 *
 * Link: https://leetcode.com/problems/find-unique-binary-string
 */
public class FindUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        List<Integer> numsBaseTen = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numsBaseTen.add(Integer.parseInt(nums[i], 2));
        }
        String ans = "";

        for (int i = 0; i < Math.pow(2, n); i++) {
            if (!numsBaseTen.contains(i)) {
                ans = Integer.toBinaryString(i);
                while (ans.length() != n) {
                    ans = '0' + ans;
                }
                break;
            }
        }

        return ans;
    }
}
