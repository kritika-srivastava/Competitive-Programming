import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solutio {

    public static void main(String Args[])
    {
        Scanner kb=new Scanner(System.in);
        int n=0;int p=0,ne=0,z=0;double k,l,m;
        n=kb.nextInt();
        if((n>0)&&(n<=100))
       { int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
            if((arr[i]>=-100)&&(arr[i]<=100))
           { if(arr[i]<0){ne++;}
            else if (arr[i]>0){p++;}
          else{z++;}
        }
    }
    System.out.println(p+" "+ne+" "+z);
    if((p!=0)||(ne!=0)||(z!=0))
    {
        k=( p/n);
        l= (ne/n);
        m=(z/n);
        System.out.println(k);
         System.out.println(l);
          System.out.println(m);
       
    }
    }
}
}
