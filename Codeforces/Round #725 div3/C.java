import java.io.*;
import java.util.*;
//----------------------------------------

//VERY NICE QUESTION
//TOOK A LOT TIME TO UNDERSTAND THE OTHER APPROACHES TO SOLVE THIS

//----------------------------------------
public class C {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int test = fs.nextInt();
		for (int t = 0; t < test; t++) {
			int n = fs.nextInt();
			int l = fs.nextInt();
			int r = fs.nextInt();
			int[] array = fs.readArray(n);
			long ans = 0;
			sort(array);
			for (int i = 0; i < n - 1; i++) {
				int lower = lowerBound(array, l - array[i], i + 1, n);
				int higher = upperBound(array, r - array[i], i + 1, n) - 1;
				// out.println(array[i] + " " + array[lower] + " " + array[higher]);
				ans += (long) higher - (long) lower + (long) 1;
			}
			out.println(ans);
		}
		out.println();
		out.close();
	}

	public static int lowerBound(int[] array, int target, int start, int end) {
		int l = start;
		int h = end;
		while (l < h) {
			int mid = l + (h - l) / 2;
			if (target <= array[mid]) {
				h = mid;
			} else
				l = mid + 1;
		}
		if (l < end && array[l] < target)
			l++;
		return l;
	}

	public static int upperBound(int[] array, int target, int start, int end) {
		int l = start;
		int h = end;
		while (l < h) {
			int mid = l + (h - l) / 2;
			if (target >= array[mid]) {
				l = mid + 1;
			} else
				h = mid;
		}
		if (l < end && array[l] <= target)
			l++;
		return l;
	}

	static void sort(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i : a)
			l.add(i);
		Collections.sort(l);
		for (int i = 0; i < a.length; i++)
			a[i] = l.get(i);
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}