/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		try (Scanner kb = new Scanner(System.in)) {
			int t = kb.nextInt();
			while (t-- > 0) {
				int n = kb.nextInt();
				int x = kb.nextInt();
				int k = 0, nn = 0;
				int a[] = new int[n];

				for (int i = 0; i < n; i++) {
					a[i] = kb.nextInt();
				}
				Arrays.sort(a);
				for (int i = 0; i < n; i++) {
					if (a[i] < x) {
						nn++;
					} else {
					}
				}

				for (int i = nn; i < n; i++) {
					if (x < a[i]) {
						while (x < a[i]) {
							x = 2 * x;
							k++;
						}
						k++;
					} else
						k++;
					x = 2 * a[i];
				}
				int total = nn + k;
				if (nn != 0) {
					k = 0;
					nn--;
					for (int i = nn; i < n; i++) {
						if (x < a[i]) {
							while (x < a[i]) {
								x = 2 * x;
								k++;
							}
							k++;
						} else
							k++;
						x = 2 * a[i];
					}
					int ans = Math.min(k + nn, total);
					System.out.println(ans);
				} else
					System.out.println(total);
			}

		}

		catch (

		Exception e) {
			return;
		}
	}
}
