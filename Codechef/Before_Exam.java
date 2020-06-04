import java.util.Scanner;

public class Before_Exam {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int days = kb.nextInt();
        int hours = kb.nextInt();
        int d[] = new int[days];
        int i = 0;
        while (i < days) {
            int min_hr = kb.nextInt();
            int max_hr = kb.nextInt();

            if (hours > max_hr) {
                hours -= max_hr;
                d[i] = max_hr;
            }

            else if (hours < max_hr && hours > min_hr) {
                d[i] = hours;
                hours = 0;
            } else {
                if (i == (days - 1) && hours < min_hr) {
                    hours = 0;
                } else {
                }
            }
            i++;
        }
        if (hours > 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            for (i = 0; i < d.length; i++) {
                System.out.print(d[i] + " ");
            }
        }

    }
}