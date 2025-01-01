/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Easy\MaxScoreAfterSplittingAString.java
 * @author Kritika Srivastava
 * @since January 01, 2025
 *
 * Link - https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/
 */
public class MaxScoreAfterSplittingAString {

    public int maxScore(String s) {
        int l = s.length();
        int scorezero[] = new int[l];
        int scoreone[] = new int[l];
        int temp = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == '0') {
                temp++;
            }

            scorezero[i] = temp;
        }
        temp = 0;
        for (int i = l - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                temp++;
            }

            scoreone[i] = temp;
        }

        int ans = 0;

        for (int i = 0; i < l - 1; i++) {
            // System.out.println(scorezero[i]+" "+scoreone[i+1]);
            temp = scorezero[i] + scoreone[i + 1];
            ans = Math.max(ans, temp);
        }

        return ans;
    }

}
