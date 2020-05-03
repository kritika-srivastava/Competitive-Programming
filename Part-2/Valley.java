
import java.util.Scanner;

public class Valley {

    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        kb.nextLine();
        if ((n >= 1) && (n <= 1000000)) {
            String arr[] = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextLine();

            }
            int k = 0;
            String x = "U", y = "D";
            for (int i = 0; i < n - 1; i++) {
                if ((arr[i].equals(y) == true) && (arr[i + 1].equals(x) == true)) {
                    k++;
                }
            }
            System.out.println(k);
        }
    }
}
