import java.util.Scanner;

class LongestArithmetic {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        int x = 1;
        while (t-- > 0) {
            int n = kb.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int k = 0,m=0;
            for (int i = 0; i < n - 1; ) {
                int diff = (arr[i + 1] - arr[i]);
                int l = 1;int j=0;
                for (j = i + 1; j < n; j++) {
                    if ((arr[j] - arr[j - 1]) == diff) {
                        l++;
                    } else {m=j;break;
                    }
                }
                if (l > k) {
                    k = l;
                } else {
                }
                i=j-1;
                
            }
            System.out.println("Case #" + x + ": " + k);
            x++;
        }
    }
}
