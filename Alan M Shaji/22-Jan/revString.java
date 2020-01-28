import java.io.*;
import java.util.Scanner;

public class revString
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
String n,reverse="";
int l, i=0,j;
System.out.print("Enter String	->	");
n=s.nextLine();


j=n.length()-1;
for(i=0;i<n.length();i++,j--)
{
reverse=reverse+n.charAt(j);
}
System.out.print("reverse string	->	"+reverse);


/*
char [] str = n.toCharArray();
char rev[]=new char[n.length()];
int k=n.length();
l=k-1;
i=0;
while (l>=0)
{
rev[i]=str[l];
l--;
i++;
}
System.out.print("reverse string	->	");
for(i=0;i<k;i++)
System.out.print(rev[i]);
*/



}
}

