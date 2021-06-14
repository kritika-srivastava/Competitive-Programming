
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/Valid_parentheses.java
 * @author Kritika Srivastava
 * @since June 14, 2021
 *
 * Description - Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * 
 * Link - https://leetcode.com/problems/valid-parentheses/
 */
import java.util.*;

class Valid_parentheses {
    public boolean isValid(String s) {

        boolean res = true;
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }

            else {

                switch (s.charAt(i)) {

                    case ')': {
                        if (st.isEmpty() || st.peek() != '(') {
                            res = false;
                            i = s.length();
                            break;
                        } else {
                            st.pop();
                        }
                        break;
                    }

                    case '}': {
                        if (st.isEmpty() || st.peek() != '{') {
                            res = false;
                            i = s.length();
                            break;
                        } else {
                            st.pop();
                        }
                        break;
                    }

                    case ']': {
                        if (st.isEmpty() || st.peek() != '[') {
                            res = false;
                            i = s.length();
                            break;
                        } else {
                            st.pop();
                        }
                        break;
                    }
                }
            }
        }

        if (!st.isEmpty()) {
            res = false;
        }

        return res;
    }
}
