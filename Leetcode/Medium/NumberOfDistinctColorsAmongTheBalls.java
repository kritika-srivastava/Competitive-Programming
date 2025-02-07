import java.util.*;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\NumberOfDistinctColorsAmongTheBalls.java
 * @author Kritika Srivastava
 * @since February 07, 2025
 *
 * Link: https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls/
 */
public class NumberOfDistinctColorsAmongTheBalls {

    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> keyValueMap = new HashMap<>();
        HashMap<Integer, Integer> valueFrequencyMap = new HashMap<>();
        int[] result = new int[queries.length];
        int uniqueValueCount = 0;

        for (int i = 0; i < queries.length; i++) {
            int key = queries[i][0], newValue = queries[i][1];

            if (keyValueMap.containsKey(key)) {
                int oldValue = keyValueMap.get(key);
                valueFrequencyMap.put(oldValue, valueFrequencyMap.get(oldValue) - 1);
                if (valueFrequencyMap.get(oldValue) == 0) {
                    valueFrequencyMap.remove(oldValue);
                    uniqueValueCount--;
                }
            }

            keyValueMap.put(key, newValue);
            valueFrequencyMap.put(newValue, valueFrequencyMap.getOrDefault(newValue, 0) + 1);
            if (valueFrequencyMap.get(newValue) == 1) {
                uniqueValueCount++;
            }

            result[i] = uniqueValueCount;
        }

        return result;
    }
}

