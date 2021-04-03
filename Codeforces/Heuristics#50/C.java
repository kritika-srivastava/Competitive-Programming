import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        int cap=kb.nextInt();
        double lit=25*(Math.log(t*60)-Math.log(60));
        double ret=lit/cap;
        System.out.println((int)Math.ceil(ret));
    }
}
