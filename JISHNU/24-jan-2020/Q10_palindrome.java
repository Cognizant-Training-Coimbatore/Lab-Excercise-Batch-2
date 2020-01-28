package day3;

import java.util.Scanner;

class palindrome
{
	void check()
	{
		Scanner rev = new Scanner (System.in);
		System.out.println("Enter the string");
		String str=rev.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0; i--)
		{
		reverse= reverse+ str.charAt(i);
		}
		if(str.equals(reverse))
		System.out.println("String is a palindrome");
		else
		System.out.println("String is not a palindrome");
	}
}

public class Q10_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome obj=new palindrome();
		obj.check();

	}

}
