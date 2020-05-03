/*PROGRAM 25
 Write a program to write n names and their ages in text files and then read the entered data from the text file.
 */

import java.io.*;

public class Text_Files {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        System.out.println("Enter the name of the text file:");
        String q = in.readLine();
        String F = q + ".text";
        System.out.println("Writing data in text file:");
        try {
            FileWriter f = new FileWriter(F);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter p = new PrintWriter(b);
            System.out.println("Enter the number of elements:");
            int n = Integer.parseInt(in.readLine());
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the name:");
                String name = in.readLine();
                System.out.println("Enter the age:");
                int age = Integer.parseInt(in.readLine());
                p.println(name);
                p.println(age);
            }
            p.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Reading Data from text file:");
        FileReader t = new FileReader(F);
        BufferedReader b = new BufferedReader(t);
        String txt;
        int i = 0;
        while ((txt = b.readLine()) != null) {
            i++;
            if (i == 1 || i % 2 != 0) {
                System.out.println("Name :");
                System.out.println(txt);
            } else {
                System.out.println("Age :");
                System.out.println(txt);
            }
        }
        b.close();
    }
}
