import java.util.Scanner;

public class anagram {
    String a = " ";

    public void make_anagram(String prefix, String a) {
        if (a.length() <= 1) {
            System.out.println(prefix + a);
        } else {
            for (int i = 0; i < a.length(); i++) {
                String cur = a.substring(i, i + 1);
                String before = a.substring(0, i);
                String after = a.substring(i + 1);
                make_anagram(prefix + cur, before + after);
            }
        }
    }

    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        anagram ob = new anagram();
        System.out.println("Enter the string :");
        String b = kb.nextLine();
        System.out.println("Enter the prefix:");
        String p = kb.nextLine();
        ob.make_anagram(p, b);
    }
}
