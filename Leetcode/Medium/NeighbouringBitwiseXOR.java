package Leetcode.Medium;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\NeighbouringBitwiseXOR.java
 * 
 * @author Kritika Srivastava
 * @since January 19, 2025
 *
 *        Link - https://leetcode.com/problems/neighboring-bitwise-xor/
 */
public class NeighbouringBitwiseXOR {
    public boolean doesValidArrayExist(int[] derived) {

        int ans = 0, n = derived.length;

        for (int i = 0; i < n; i++) {
            ans = ans ^ derived[i];
        }

        if (ans != 0) {
            return false;
        }

        return true;
    }
}
