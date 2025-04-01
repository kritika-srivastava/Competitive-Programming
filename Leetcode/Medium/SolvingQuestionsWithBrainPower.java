/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\SolvingQuestionsWithBrainPower.java
 * 
 * @author Kritika Srivastava
 * @since April 01, 2025
 *
 *        Link: https://leetcode.com/problems/solving-questions-with-brainpower/
 */
public class SolvingQuestionsWithBrainPower {

    static long points;
    long[] dp;

    public long mostPoints(int[][] questions) {
        points = 0;
        dp = new long[questions.length];
        return backtrack(questions, 0);
    }

    private long backtrack(int[][] questions, int index) {
        if (index >= questions.length)
            return 0;

        if (dp[index] != 0)
            return dp[index];

        int nextIndex = index + questions[index][1] + 1;
        long take = questions[index][0] + (nextIndex < questions.length ? backtrack(questions, nextIndex) : 0);

        long skip = backtrack(questions, index + 1);

        return dp[index] = Math.max(take, skip);
    }

}
