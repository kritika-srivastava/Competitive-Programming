/**
 * E:\#Fod Do\Competitive-Coding\Geeks for Geeks\Longest_Subarray_Even.java
 * @author Kritika Srivastava
 * @since May 01, 2021
 *
 * Longest subarray with atmost k even elements.
 * Link - https://practice.geeksforgeeks.org/problems/longest-subarray-with-atmost-k-even-elements/0/
 */
import java.util.*;

class Longest_Subarray_Even {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt();
            int k = kb.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
                if(a[i]%2==0)
                {
                    a[i]=1;
                }else{a[i]=0;}
            }
            Stack<Integer> st=new Stack<Integer>();
            int prev = 0, max = 0, j = 0;
            for (int i = 0; i < n; i++) {

                if (a[i] == 0) {
                } else if (a[i] == 1 && j >= k) {
                    if(!st.isEmpty())
                    {
                        prev = st.pop() + 1;
                    }
                    else{
                        prev=0;
                    }

                } else{
                   st.push(i);
                    j++;
                }
                int temp = i - prev + 1;
                if (temp > max) {
                    max = temp;
                } else {
                }
                //System.out.println(prev+" prev");
                //System.out.println(j+" j");
            }
            System.out.println(max);
        }
    }
}