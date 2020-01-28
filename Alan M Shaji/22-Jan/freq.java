import java.io.*;
import java.util.Scanner;

public class freq
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
String n;
int i,j;
System.out.print("Enter String	->	");
n=s.nextLine();
char str[]=n.toCharArray();
int freq[]=new int[n.length()];
for(i=0;i<n.length();i++)
{
freq[i]=1;
for(j=i+1;j<n.length();j++)
{
if(str[i]==str[j])
{
freq[i]++;
str[j]=0;
}
}
}
for(i=0;i<n.length();i++)
{
if(str[i]!=0)
System.out.println(str[i]+"	->	"+freq[i]);
}
}
}

