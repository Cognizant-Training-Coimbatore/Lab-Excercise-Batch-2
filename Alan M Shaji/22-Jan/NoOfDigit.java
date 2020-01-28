import java.io.*;
import java.util.Scanner;

public class NoOfDigit
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
String n;
int i, count=0;
System.out.print("Enter String	->	");
n=s.nextLine();
for(i=0;i<n.length();i++)
{
if(Character.isDigit(n.charAt(i)))
{
count++;
}
}
System.out.println("No.of digits	->	"+count);
}
}

