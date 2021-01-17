
/**
 * C:\Users\kriti\Desktop\DS\Target 450\q6.java
 * @author Kritika Srivastava
 * @since January 17, 2021
 * Find Union of Two arrays
 * Link - https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
 */
import java.util.*;

class q6 {
	public static void main(String[] args) {

		// Taking input using class Scanner
		Scanner sc = new Scanner(System.in);

		// Taking total count of testcases
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {

			int n, m;

			// taking size of array a
			n = sc.nextInt();

			// taking size of array b
			m = sc.nextInt();

			// Creating 2 array of size n and m
			int a[] = new int[n];
			int b[] = new int[m];

			// inserting elements to array a
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			// inserting elements to array b
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}

			// calling doUnion method and printing the results
			System.out.println(doUnion(a, n, b, m));
		}

	}

	public static int doUnion(int a[], int n, int b[], int m) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
			} else {
				map.put(a[i], 0);
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (map.containsKey(b[i])) {
			} else {
				map.put(b[i], 0);
			}
		}
		return map.size();
	}
}