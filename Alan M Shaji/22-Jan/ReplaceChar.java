import java.io.*;
import java.util.Scanner;

public class ReplaceChar
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
String n,repStr;
int i;
System.out.print("Enter String	->	");
n=s.nextLine();
System.out.print("Enter Replace Character	->	");
char ch=s.next().charAt(0);
System.out.print("Enter Replacing Character	->	");
char c=s.next().charAt(0);
repStr=n.replace(ch,c);
System.out.println("New String	->	"+repStr);
}
}

