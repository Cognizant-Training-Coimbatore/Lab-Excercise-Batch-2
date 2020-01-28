import java.io.*;
import java.util.Scanner;
public class fib
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
int n,f1=1,f0=0,i=2;
System.out.print("Range	->	");
n=s.nextInt();
System.out.println("Fibnocci series...");
if(n==1)
System.out.print(f0);
else if(n==2)
System.out.print(f0+", "+f1);
else if(n>2)
{
System.out.print(f0+", "+f1);
while (i<=n)
{
int f2=f0+f1;
System.out.print(", "+f2);
f0=f1;
f1=f2;
i++;
}
}
else
System.out.print("wrong entry");
}
}