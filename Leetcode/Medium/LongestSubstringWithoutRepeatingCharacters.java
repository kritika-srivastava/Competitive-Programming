package Leetcode.Medium;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                temp += s.charAt(i);
                count++;
            } else {
                if (temp.contains(String.valueOf(s.charAt(i)))) {
                    count = Math.max(count, temp.length());
                    temp = temp.substring(temp.indexOf(s.charAt(i)) + 1) + s.charAt(i);
                    count = Math.max(count, temp.length());
                } else {
                    temp += s.charAt(i);
                    count = Math.max(count, temp.length());
                }
            }
        }

        return count;
    }
}
