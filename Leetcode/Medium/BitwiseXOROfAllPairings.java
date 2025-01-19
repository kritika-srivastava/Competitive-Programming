package Leetcode.Medium;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\BitwiseXOROfAllPairings.java
 * 
 * @author Kritika Srivastava
 * @since January 19, 2025
 *
 *        Link - https://leetcode.com/problems/bitwise-xor-of-all-pairings/
 */
public class BitwiseXOROfAllPairings {
    public int xorAllNums(int[] nums1, int[] nums2) {

        int n1 = nums1.length, n2 = nums2.length;
        int ans1 = 0, ans2 = 0;

        if (n2 % 2 != 0) {
            for (int i = 0; i < n1; i++) {
                ans1 = ans1 ^ nums1[i];
            }
        }

        if (n1 % 2 != 0) {
            for (int i = 0; i < n2; i++) {
                ans2 = ans2 ^ nums2[i];
            }
        }

        return ans1 ^ ans2;

    }
}
