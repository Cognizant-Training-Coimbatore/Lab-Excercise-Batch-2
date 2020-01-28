import java.io.*;
import java.util.Scanner;
public class factorial
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
int n,fact=1;
System.out.print("Number	->	");
n=s.nextInt();
while (n>0)
{
fact=fact*n;
n--;
}
System.out.println("Factorial->"+fact);
}
}