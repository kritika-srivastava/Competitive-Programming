import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine();
        char[] ch = a.toCharArray();
        Arrays.sort(ch);
        LinkedList<LinkedList<Character>> l = new LinkedList<LinkedList<Character>>();
        backtrack(ch, l, new LinkedList<Character>(), 0);

        int x = l.size() - 1;
        System.out.print("[");
        for (LinkedList<Character> k : l) {
            System.out.print("[");
            int y = k.size() - 1;
            for (char ll : k) {
                System.out.print("'" + ll + "'");
                if (y > 0) {
                    System.out.print(",");
                }                                                                                                    
                y--;
            }

            System.out.print("]");
            if (x > 0) {
                System.out.print(",");
            }
            x--;

        }
        System.out.print("]");
    }

    static void backtrack(char[] ch, LinkedList<LinkedList<Character>> l, LinkedList<Character> ll, int k) {
        Collections.sort(ll);
        if (!l.contains(ll)) {
            l.add(new LinkedList<Character>(ll));
        }

        for (int i = k; i < ch.length; i++) {
            ll.add(ch[i]);
            backtrack(ch, l, ll, i + 1);
            ll.remove(ll.size() - 1);
        }
        return;
    }
}