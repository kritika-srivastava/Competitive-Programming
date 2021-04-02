import java.util.Scanner;
public class A
{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        while(kb.hasNextLine())
        {
            String s=kb.nextLine();
            System.out.println("NO");
            System.out.flush();
        }
    }
}