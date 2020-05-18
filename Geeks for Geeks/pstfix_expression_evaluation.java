import java.util.*;
import java.util.Scanner;

class gfg {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		for (int j = 0; j < t; j++) {
			String m = kb.next();
			int n,l;
			Stack<Integer> st = new Stack<Integer>();
			for (int i = 0; i < m.length(); i++) {
				if (Character.isDigit(m.charAt(i)) == true) {
					 int a=Character.getNumericValue(m.charAt(i));
					st.push(a);
				} else {
					char k = m.charAt(i);
					if (st.isEmpty() == false) {
						if (k == '+') {
							l=st.pop();n=st.pop();
							st.push(n+l);

						} else if (k == '-') {
							l=st.pop();n=st.pop();
							st.push(n-l);

						} else if (k == '*') {
							l=st.pop();n=st.pop();
							st.push(n*l);

						} else if (k == '/') {
							l=st.pop();n=st.pop();
							st.push(n/l);

						}
					}else{}
				}
				
			}System.out.println(st.pop());
			
		}kb.close();
	}
}
