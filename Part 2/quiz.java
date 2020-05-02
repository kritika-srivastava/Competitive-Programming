/* PROGRAM 27
 The quiz has five questions with four multiple choices (A, B, C, D), with each question carrying I mark for the correct answer. Design a program to accept the number of participants N such that N must be greater than 3 and less than I l. Create a double dimensional array of size (Nx5) to store the answers of each participant row-wise. Calculate the marks for each participant by matching the correct answer stored in a single dimensional array of size 5. Display the scores for each participant and also the participant(s) having the highest score.
 */
import java.util.Scanner;
public class quiz
{
public static void main(String Args[])
{
Scanner kb=new Scanner(System.in);
String k[]=new String[5];
System.out.println("Enter the key:");
for(int i=0;i<5;i++)
{k[i]=kb.next();}
System.out.println("Enter the number of participants:");
int N=kb.nextInt();
if((N>3)&(N<11))
{
String s[][]=new String[N][5];
int r[]=new int[N];
for(int i=0;i<N;i++)
{r[i]=0;
System.out.println("Give the entries of participant "+(i+1)+" :");
for(int j=0;j<5;j++)
{
s[i][j]=kb.next();
}}
for(int i=0;i<N;i++)
{for(int j=0;j<5;j++)
{
if(s[i][j].compareTo(k[j])==0)
{r[i]+=1;}
else{}
}}
int max=r[0], u=0;
for(int i=1;i<N;i++)
if(r[i]>max)
{max=r[i];u=i;}
else{}
System.out.println("Scores");
for(int i=0;i<N;i++)
{System.out.println("Participant"+(i+1)+" :"+r[i]);}
System.out.println("High score = Participant "+(u+1));
}
else
{System.out.println("SIZE OUT OF RANGE");}
}}