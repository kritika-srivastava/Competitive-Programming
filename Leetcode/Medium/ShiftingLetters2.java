package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\ShiftingLetters2.java
 * @author Kritika Srivastava
 * @since January 10, 2025
 *
 * Link: https://leetcode.com/problems/shifting-letters-ii/
 */
public class ShiftingLetters2 {
        public String shiftingLetters(String s, int[][] shifts) {
            int len = s.length();
            int[] letterShift = new int[len + 1]; 
    
            // Apply range updates using difference array.
            for (int[] shift : shifts) {
                int start = shift[0];
                int end = shift[1];
                int direction = shift[2] == 1 ? 1 : -1;
    
                letterShift[start] += direction;
                if (end + 1 < len) {
                    letterShift[end + 1] -= direction;
                }
            }
    
            // Compute prefix sum to get final shifts for each character.
            for (int i = 1; i < len; i++) {
                letterShift[i] += letterShift[i - 1];
            }
    
            // Build the result string.
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < len; i++) {
                int shift = letterShift[i];
                int newChar = (s.charAt(i) - 'a' + shift) % 26;
                if (newChar < 0) {
                    newChar += 26;
                }
                result.append((char) ('a' + newChar));
            }
    
            return result.toString();
        }
        
}
