import java.util.Scanner;

public class Slope {
    double x1, x2, y1, y2, m1, m2, s;

    void slope() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the coordinates of pt.1:");
        x1 = kb.nextDouble();
        y1 = kb.nextDouble();
        System.out.println("Enter the coordinates of pt.2:");
        x2 = kb.nextDouble();
        y2 = kb.nextDouble();
        s = ((y2 - y1) / (x2 - x1));
        System.out.println("The slope of line is" + s);
    }

    void mid() {
        m1 = ((x1 + x2) / 2);
        m2 = ((y1 + y2) / 2);
        System.out.println("The mid-pt of line is (" + m1 + "," + m2 + ")");
    }

    public static void main(String Args[]) {
        Slope s1 = new Slope();
        s1.slope();
        s1.mid();
    }
}
