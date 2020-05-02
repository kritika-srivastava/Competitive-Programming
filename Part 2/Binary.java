/*PROGRAM 26
Write a program to write a text in binary file and then read the text from binary file.
 */
import java.util.*; 
import java.io.*; 
public class Binary//Program 26 
{ 
    static String fileName="stu.dat"; 
    static Scanner sc=new Scanner(System.in); 
    public static void main(String args[])throws IOException 
    { 
        int rno;   float marks; 
        FileOutputStream fw=new FileOutputStream(fileName); 
        DataOutputStream dw=new DataOutputStream(fw); 
        for(int i=0;i<5;i++) 
        { 
            System.out.println("Enter Roll Number."); 
            rno=sc.nextInt(); 
            System.out.println("Enter Marks."); 
            marks=sc.nextFloat(); 
            dw.writeInt(rno); 
            dw.writeFloat(marks); 
        } 
        dw.close();      fw.close(); 
        boolean EOF=false; 
        FileInputStream fr=new FileInputStream(fileName); 
        DataInputStream dr=new DataInputStream(fr); 
        while(!EOF) 
        { 
            try 
            { 
                rno=dr.readInt(); 
                System.out.println("\n Roll number "+rno); 
                marks=dr.readFloat(); 
                System.out.println("\n Marks "+marks); 
            } 
            catch(IOException el) 
            { 
            System.out.println("............................"); 
            System.out.println("End of file."); 
            EOF=true; 
            } 
        } 
    } 
} 