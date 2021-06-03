/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Interleaving_String.java
 * 
 * @author Kritika Srivastava
 * @since June 03, 2021
 *
 *        Description - Given strings s1, s2, and s3, find whether s3 is formed
 *        by an interleaving of s1 and s2. Link -
 *        https://leetcode.com/problems/interleaving-string/
 */
class Interleaving_String {
    static boolean isInterleave(String s1, String s2, String s3) {

        if ((s1.length() + s2.length()) != s3.length()) {
            return false;
        }

        boolean[][] a = new boolean[s2.length() + 1][s1.length() + 1];

        a[0][0] = true;

        for (int i = 1; i < a[0].length; i++) {
            a[0][i] = a[0][i - 1] && (s1.charAt(i - 1) == s3.charAt(i - 1));
        }

        for (int i = 1; i < a.length; i++) {
            a[i][0] = a[i - 1][0] && (s2.charAt(i - 1) == s3.charAt(i - 1));
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[0].length; j++) {
                a[i][j] = (a[i - 1][j] && (s2.charAt(i - 1) == s3.charAt(i + j - 1)))
                        || (a[i][j - 1] && (s1.charAt(j - 1) == s3.charAt(i + j - 1)));
            }
        }

        return a[s2.length()][s1.length()];
    }
}