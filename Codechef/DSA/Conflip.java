/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Conflip {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int T = kb.nextInt();
		for (int t = 0; t < T; t++) {
			int G = kb.nextInt();
			for (int game = 0; game < G; game++) {
				int I = kb.nextInt();
				int N = kb.nextInt();
				int Q = kb.nextInt();

				System.out.println(solve(I, N, Q));
			}
		}

		kb.close();
	}

	static int solve(int I, int N, int Q) {
		return (N % 2 != 0 && I != Q) ? (N / 2 + 1) : (N / 2);
	}
}
