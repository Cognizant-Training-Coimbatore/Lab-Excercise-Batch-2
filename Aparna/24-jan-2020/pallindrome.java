package package2;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String input="amma";
		char[] inputarray=input.toCharArray();
		String rev="";
		for(i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
	   
if(input.equals(rev))
{
	System.out.println("pallindrome");
}
else
{
	System.out.println("not pallindrome");
}
	}

}
