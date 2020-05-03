import java.util.Scanner;

public class Mobike {
        public int bno;
        private int ph_no;
        private String name;
        private int days;
        private int charge;

        void input() {
                Scanner kb = new Scanner(System.in);
                System.out.println("Enter batch no. : ");
                bno = kb.nextInt();
                System.out.println("Enter phone no. : ");
                ph_no = kb.nextInt();
                System.out.println("Enter name : ");
                name = kb.next();
                System.out.println("Enter no. of days : ");
                days = kb.nextInt();
        }

        void compute() {
                if (days <= 5) {
                        charge = (500 * days);
                }
                if ((days > 5) & (days <= 10)) {
                        charge = 2500 + (400 * (days - 5));
                }
                if (days > 10) {
                        charge = 200 * days;
                }
        }

        void display() {
                System.out.println("===============================================");
                System.out.println(" Bike no.\t" + "Phone no.\t" + "Name\t" + "No. of days\t" + "Charge\t");
                System.out.println(bno + "\t" + ph_no + "\t" + name + "\t" + days + "\t" + charge + "\t");
        }
}