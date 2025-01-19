package Leetcode.Medium;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\PrefixCommonArrayof2Arrays.java
 * 
 * @author Kritika Srivastava
 * @since January 19, 2025
 *
 *        Link-https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/
 */
public class PrefixCommonArrayof2Arrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = B.length, max = 0;
        int ans[] = new int[n];
        int prefix[] = new int[n];

        for (int i = 0; i < n; i++) {
            prefix[A[i] - 1]++;
            if (prefix[A[i] - 1] == 2) {
                max++;
            }
            prefix[B[i] - 1]++;
            if (prefix[B[i] - 1] == 2) {
                max++;
            }

            ans[i] = max;
        }

        return ans;

    }

}
