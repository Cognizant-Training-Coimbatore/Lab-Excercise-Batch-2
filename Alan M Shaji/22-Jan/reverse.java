import java.io.*;
import java.util.Scanner;
public class reverse
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
int n,rev=0,rem;

System.out.print("Number	->	");
n=s.nextInt();
if(n<2)
System.out.println("neither prime nor composite");
rem=n;
while (rem>0)
{
int digit=rem%10;
rev=rev*10+digit;
rem=rem/10;
}
System.out.println("Reverse of "+ n +"	->	"+rev);
}
}