/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Day-4/Latest_Time.java
 * 
 * @author Kritika Srivastava
 * @since May 30, 2021
 *
 *        Description - You are given a string time in the form of hh:mm, where
 *        some of the digits in the string are hidden (represented by ?). The
 *        valid times are those inclusively between 00:00 and 23:59. Return the
 *        latest valid time you can get from time by replacing the hidden
 *        digits.
 * 
 *        Link -
 *        https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/
 */
public class Latest_Time {
    public String maximumTime(String time) {
        if (time.charAt(0) == '?' && ((int) time.charAt(1) - '0' >= 4) && time.charAt(1) != '?') {
            time = time.replaceFirst("\\?", "1");
        } else if (time.charAt(0) == '?') {
            time = time.replaceFirst("\\?", "2");
        }

        if (time.charAt(1) == '?' && time.charAt(0) == '2') {
            time = time.replaceFirst("\\?", "3");
        } else if (time.charAt(1) == '?') {
            time = time.replaceFirst("\\?", "9");
        } else {
        }

        if (time.charAt(3) == '?') {
            time = time.replaceFirst("\\?", "5");
        } else {
        }
        if (time.charAt(4) == '?') {
            time = time.replaceFirst("\\?", "9");
        } else {
        }
        return time;

    }
}
