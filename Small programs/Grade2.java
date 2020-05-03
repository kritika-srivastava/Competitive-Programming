import java.util.Scanner;

public class Grade2 {
  public static void main(String Args[]) {
    int num, number;
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter marks:");
    num = kb.nextInt();
    kb.nextLine();
    System.out.println("Press 1 if your marks are greater than 90");
    System.out.println("Press 2 if your marks are between 80 and 89");
    System.out.println("Press 3 if your marks are between 70 and 79");
    System.out.println("Press 4 if your marks are between 60 and 69");
    System.out.println("Press 5 if your marks are between 50 and 59");
    System.out.println("Press 6 if your marks are between 40 and 49");
    System.out.println("Press 7 if your marks are between 00 and 39");
    number = kb.nextInt();
    switch (number) {
      case 1:
        System.out.println("Grade A+");
        break;
      case 2:
        System.out.println("Grade A");
        break;
      case 3:
        System.out.println("Grade B+");
        break;
      case 4:
        System.out.println("Grade B");
        break;
      case 5:
        System.out.println("Grade C");
        break;
      case 6:
        System.out.println("Grade D");
        break;
      case 7:
        System.out.println("Grade E");
        break;
      default:
        System.out.println("Invalid Input");
        break;
    }
  }
}
