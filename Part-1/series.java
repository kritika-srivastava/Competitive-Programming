import java.util.Scanner;

public class series {
    double n = 0.0, a = 1.0;
    int b = 0, c = 1, d = 0;
    int i = 0;
    double sum1 = 0, sum2 = 1, sum3 = 0, e = 1.0, f = 2.0, g = 0.0, h = 0.0;

    public void input(double nn) {
        n = nn;
    }

    public void series1() {
        System.out.println("The series1 is as follows:");
        for (i = 1; i <= n; i++) {
            a = a * i;
            sum1 = sum1 + (i / a);
            System.out.println(sum1);
        }
        System.out.println("The sum of series1 is as follows:");
        System.out.println(sum1);
    }

    public void series2() {
        System.out.println("The fibonacci series is as follows:");
        System.out.println(b);
        System.out.println(c);
        for (i = 2; i <= n; i++) {
            d = b + c;
            System.out.println(d);
            b = c;
            c = d;
            sum2 = sum2 + d;
        }
        System.out.println("The sum of fibonacci series is as follows:");
        System.out.println(sum2);
    }

    public void series3() {
        System.out.println("Series3 is as follows:");
        for (i = 1; i <= n; i++) {
            e = e * i;
            g = Math.pow(n, f);
            f += 2;
            h = g / e;
            System.out.println(h);
        }
        System.out.println("The sum of series3 is as follows:");
        System.out.println(h);
    }

    public void display() {
        sum3 = sum1 + sum2 + h;
        System.out.println("The sum of all series is as follows:");
        System.out.println(sum3);
    }

    public static void main(String Args[]) {
        series s1 = new series();
        s1.series1();
        s1.series2();
        s1.series3();
        s1.display();
    }
}
