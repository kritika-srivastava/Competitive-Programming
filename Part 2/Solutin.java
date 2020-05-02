import java.util.Scanner;
public class Solutin {

    public static void main (String Args[])
    {
        Scanner kb=new Scanner(System.in);
              int n=kb.nextInt();
        int m[]=new int[5];
        for(int i=0;i<5;i++)
            {m[i]=0;}
        if((n>=5)&&(n<=(200000)))
        {
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=kb.nextInt();
            }
            int l=0;
            for(int j=0;j<5;j++)
            {
              for(int i=0;i<n;i++)
                {
                   if(arr[i]==(j+1)){m[j]+=1;}
                }
            }
            
            int max=m[0];
            for(int j=01;j<4;j++)
            {
             if(max<m[j+1]){max=m[j+1];}
            }
            for(int j=00;j<=4;j++)
            {
             if(max==m[j]){l=j;break;}
            }
            
            System.out.println(l+1);
        }
    }
}
