import java.io.*;
import java.util.Scanner;
public class Nprimes
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
int n,i,j;

System.out.print("Range	->	");
n=s.nextInt();
if(n<2)
System.out.println("No primes");
else if(n==2)
System.out.print(2);
else if(n>2)
{
System.out.print("2");
for(i=3;i<=n;i++)
{
int flag=0;
for(j=2;j<i/2;j++)
{
if(i%j==0)
flag=1;
}
if(flag==0)
System.out.print(", "+i);
}
}
}
}