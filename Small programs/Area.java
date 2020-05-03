import java.util.Scanner;

public class Area {
    public static void main(String Args[]) {
        double side, length, breadth;
        double radius, base, height;
        int number;
        Scanner kb = new Scanner(System.in);
        System.out.println("Press 1 for  area  of  square");
        System.out.println("Press 2 for the area  of  rectangle");
        System.out.println("Press 3 for  area  of  circle");
        System.out.println("Press 4 for  area  of  triangle");
        number = kb.nextInt();
        switch (number) {
            case 1:
                System.out.println("Enter the side of Square:");
                side = kb.nextDouble();
                System.out.println("Area of square is:" + (side * side));
                break;
            case 2:
                System.out.println("Enter the length and breadth of rectangle:");
                length = kb.nextDouble();
                breadth = kb.nextDouble();
                System.out.println("Area of rectangle is" + (length * breadth));
                break;
            case 3:
                System.out.println("Enter the radius of circle:");
                radius = kb.nextDouble();
                System.out.println("Area of circle is:" + (Math.PI * Math.pow(radius, 2)));
                break;
            case 4:
                System.out.println("Enter base and height of triangle:");
                base = kb.nextDouble();
                height = kb.nextDouble();
                System.out.println("Area of triangle is:" + (1.5 * base * height));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
