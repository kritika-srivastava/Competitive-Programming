import java.util.HashMap;
import java.util.HashSet;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\GoodWaysToSplitAString.java
 * @author Kritika Srivastava
 * @since December 19, 2024
 *
 * Link - https://leetcode.com/problems/number-of-good-ways-to-split-a-string/
 */
public class GoodWaysToSplitAString {
    public int numSplits(String s) {
        int count = 0, n = s.length();

        HashSet<Character> set1 = new HashSet<>();
        HashMap<Integer, Integer> distinct = new HashMap<>();

        HashSet<Character> set2 = new HashSet<>();
        HashMap<Integer, Integer> distinct2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            set1.add(s.charAt(i));
            distinct.put(i, set1.size());

            set2.add(s.charAt(n - i - 1));
            distinct2.put(n - i - 1, set2.size());

        }

        for (int i = 0; i < n - 1; i++) {
            int left = distinct.get(i);
            int right = distinct2.get(i + 1);
            if (left == right) {
                count++;
            }
        }
        return count;
    }
}