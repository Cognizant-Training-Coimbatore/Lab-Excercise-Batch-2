import java.io.*;
import java.util.Scanner;
public class palindrome
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
if(rev==n)
System.out.println(n +"	->	palindrome");
else
System.out.println(n +"	->	not palindrome");
}
}