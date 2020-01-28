import java.io.*;
import java.util.Scanner;
public class primeornot
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
int n,i,flag=0;
System.out.print("Number	->	");
n=s.nextInt();
if(n<2)
System.out.println("neither prime nor composite");
else
{
for(i=2;i<n/2;i++)
{
if(n%i==0)
flag=1;
}
if(flag==1)
System.out.println(n +"	->	is not a prime");
else
System.out.println(n +"	->	is a prime");
}
}
}