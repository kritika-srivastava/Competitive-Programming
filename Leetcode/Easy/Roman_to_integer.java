/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/Roman_to_integer.java
 * 
 * @author Kritika Srivastava
 * @since June 14, 2021
 *
 *        Description - Given a roman numeral, convert it to an integer.
 * 
 *        Link - https://leetcode.com/problems/roman-to-integer
 */
public class Roman_to_integer {
    public int romanToInt(String s) {
        int ret = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    ret += (ret >= 5 ? -1 : 1);
                    break;
                case 'X':
                    ret += 10 * (ret >= 50 ? -1 : 1);
                    break;
                case 'C':
                    ret += 100 * (ret >= 500 ? -1 : 1);
                    break;
                case 'V':
                    ret += 5;
                    break;
                case 'L':
                    ret += 50;
                    break;
                case 'D':
                    ret += 500;
                    break;
                case 'M':
                    ret += 1000;
                    break;
            }
        }
        return ret;
    }
}
