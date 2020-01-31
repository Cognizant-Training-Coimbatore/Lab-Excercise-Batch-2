package jan31;

import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) 
	{
		String str, rev = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		str = sc.next();
		
		for(int i=(str.length()-1);i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("The reversed string is : "+rev);
		

	}

}
