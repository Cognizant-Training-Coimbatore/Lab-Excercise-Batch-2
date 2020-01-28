import java.util.*;
import java.io.*;
import java.lang.*;
public class Spallin
{
public static void main(String args[])
{
        int i,len;
	String input,result="";
        Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	input=sc.nextLine();
	len=input.length();
	for(i=len-1;i>=0;i--)
	{
		result=result+input.charAt(i);
	}
	if(input.equals(result))
	{
		System.out.println(input+"is pallindrome");
	}
	else{
		System.out.println(input+ "Not pallin");
            }
}

}