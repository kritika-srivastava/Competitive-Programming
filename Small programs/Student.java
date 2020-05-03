import java.util.*;

public class Student {
    String name;
    int age;
    double m1, m2, m3, maximum, average;

    public Student() {
    }

    public Student(String nm, int ag, double mk1, double mk2, double mk3) {
        name = nm;
        age = ag;
        m1 = mk1;
        m2 = mk2;
        m3 = mk3;
        maximum = 0;
        average = 0;
    }

    public void accept() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = kb.next();
        System.out.println("Enter age : ");
        age = kb.nextInt();
        System.out.println("Enter marks in subject 1 : ");
        m1 = kb.nextDouble();
        System.out.println("Enter marks in subject 2 : ");
        m2 = kb.nextDouble();
        System.out.println("Enter marks in subject 3 : ");
        m3 = kb.nextDouble();
    }

    void calcMax_Avg() {
        maximum = Math.max(m3, Math.max(m1, m2));
        double total = m1 + m2 + m3;
        average = total / 3;
    }

    void dispResult() {
        calcMax_Avg();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks in subject 1 : " + m1);
        System.out.println("Marks in subject 2 : " + m2);
        System.out.println("Marks in subject 3 : " + m3);
        System.out.println("Maximum Marks : " + maximum);
        System.out.println("Average Marks  : " + average);
    }
}