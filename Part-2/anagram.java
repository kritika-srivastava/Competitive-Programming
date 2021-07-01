
// anagrams using backtracking - completely my imagination...duh
// but heyyy, it works...
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        LinkedList<String> l = anagram(s);
        for(String i:l)
        {
            System.out.println(i);
        }
    }

    static LinkedList<String> anagram(String s) {
        LinkedList<String> l = new LinkedList<String>();
        boolean[] visited = new boolean[s.length()];
        backtrack(l, visited, s, "");
        return l;
    }

    static void backtrack(LinkedList<String> l, boolean[] visited, String s, String st) {
        if (st.length() == s.length() && !l.contains(st)) {
            l.add(st);
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (visited[i] == false) {
                    st += s.charAt(i);
                    visited[i] = true;
                    backtrack(l, visited, s, st);
                    visited[i] = false;
                    st = st.substring(0, st.length()-1);
                }
            }
        }
    }
}
