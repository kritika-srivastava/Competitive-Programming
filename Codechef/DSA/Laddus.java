
//Problem link-https://www.codechef.com/LRNDSA01/problems/LADDU
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Laddus {
	public static void main(String[] args) throws java.lang.Exception {
		try (Scanner kb = new Scanner(System.in)) {
			int t = Integer.parseInt(kb.next());
			while (t-- > 0) {
				int n = Integer.parseInt(kb.next());
				;
				String s = kb.nextLine();
				String[] a = new String[n];
				for (int i = 0; i < n; i++) {
					a[i] = kb.nextLine();
				}
				int prize = 0, m = 0;
				for (int i = 0; i < n; i++) {
					if (a[i].equals("CONTEST_HOSTED") == true) {
						prize += 50;
					} else if ((a[i].substring(0, 11)).equals("CONTEST_WON") == true) {
						int extra = Integer.parseInt(a[i].substring(12));
						if (extra <= 20) {
							prize += (300 + (20 - extra));
						} else {
							prize += 300;
						}
					} else if ((a[i].substring(0, 9)).equals("BUG_FOUND") == true) {
						int extra = Integer.parseInt(a[i].substring(10));
						prize += extra;
					} else if (a[i].equals("TOP_CONTRIBUTOR") == true) {
						prize += 300;
					} else {
					}
				}
				if (s.charAt(1) == 'I' || s.charAt(1) == 'N') {
					if (s.charAt(1) == 'N') {
						m = 1;
					} else {
					}
				} else {
				}
				if (m == 0) {
					System.out.println((int) (prize / 200));
				} else {
					System.out.println((int) (prize / 400));
				}
			}
		} catch (Exception e) {
			return;
		}
	}
}
