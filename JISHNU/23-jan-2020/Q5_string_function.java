package Jishnu;
import java.util.Scanner;
class string_handler
{ 
	String name;
	int len;
	String call()
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		sc.close();
		return name;
	}
	String lower(String a)
	{
		String b=a.toLowerCase();
		return b;
	}
	int length(String a)
	{
	int c=a.length();
	return c;
	}
}
public class Q5_string_function 
{
	public static void main(String[] args) 
	{
		string_handler obj=new string_handler();
		String name=obj.call();
		System.out.println(name);
		String lower=obj.lower(name);
		System.out.println("String in lower case: "+lower);
		int len=obj.length(name);
		System.out.println("Length: "+len);
	}
}
