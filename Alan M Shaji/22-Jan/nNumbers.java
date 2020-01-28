import java.io.*;
import java.util.Scanner;

public class nNumbers
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
int n,i;
System.out.print("Range	->	");
n=s.nextInt();
int num[]=new int[100];
for(i=0;i<n;i++)
num[i]=s.nextInt();
System.out.println("Numbers are...");
for(i=0;i<n;i++)
System.out.println(num[i]);
}
}

