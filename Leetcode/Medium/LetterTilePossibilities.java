package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\LetterTilePossibilities.java
 * @author Kritika Srivastava
 * @since February 17, 2025
 *
 * Link: https://leetcode.com/problems/letter-tile-possibilities/
 */
public class LetterTilePossibilities {

    static int ans;
    static int[] alphabetFreq;

    public int numTilePossibilities(String tiles) {
        ans = 0;
        alphabetFreq = new int[26];

        for (int i = 0; i < tiles.length(); i++) {
            alphabetFreq[tiles.charAt(i) - 'A']++;
        }
        ans = numSequence();

        return ans;

    }

    static int numSequence() {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabetFreq[i] == 0) {
                continue;
            }
            count++;
            alphabetFreq[i]--;
            count += numSequence();
            alphabetFreq[i]++;

        }
        return count;
    }

}
