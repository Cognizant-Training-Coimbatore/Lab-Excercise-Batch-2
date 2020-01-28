import java.io.*;
import java.util.Scanner;

public class StrPalindrome
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
String n,reverse="";
int l, i=0;
System.out.print("Enter String	->	");
n=s.next();


int j=n.length()-1;
for(i=0;i<n.length();i++,j--)
{
reverse=reverse+n.charAt(j);
}




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
String reverse= new String(rev);
*/


if (reverse.equals(n))
System.out.println(n+"	->	is a palindrome");
else
System.out.println(n+"	->	is not a palindrome");
}
}

