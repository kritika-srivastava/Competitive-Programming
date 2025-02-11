/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\RemoveAllOccurencesOfSubstring.java
 * 
 * @author Kritika Srivastava
 * @since February 11, 2025
 *
 *        Link: https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
 */
public class RemoveAllOccurencesOfSubstring {
    public String removeOccurrences(String s, String part) {

        while (s.indexOf(part) != -1) {
            int pos = s.indexOf(part);
            s = s.substring(0, pos) + s.substring(pos + part.length());
        }

        return s;

    }
}
