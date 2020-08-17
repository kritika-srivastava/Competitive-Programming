import java.util.*;

public class Anagram {

	static int c = 0;

	public static void main(String Args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String s = scanner.next();
		System.out.println("The Anagrams are : ");
		display("", s);
		System.out.println("Total Number of Anagrams = " + c);
		scanner.close();
	}

	static void display(String s1, String s2) {
		if (s2.length() <= 1) {
			c++;
			System.out.println(s1 + s2);
		} else {
			for (int i = 0; i < s2.length(); i++) {
				String x = s2.substring(i, i + 1);
				String y = s2.substring(0, i);
				String z = s2.substring(i + 1);
				display(s1 + x, y + z);
			}
		}
	}
}