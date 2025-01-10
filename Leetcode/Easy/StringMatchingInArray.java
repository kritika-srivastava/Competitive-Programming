package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\StringMatchingInArray.java
 * 
 * @author Kritika Srivastava
 * @since January 10, 2025
 *
 *        Link: https://leetcode.com/problems/string-matching-in-an-array
 */
public class StringMatchingInArray {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (words[i].contains(words[j]) && i != j) {
                    if (!ans.contains(words[j])) {
                        ans.add(words[j]);
                    } else {
                    }
                } else {
                }
            }
        }

        return ans;
    }
}
