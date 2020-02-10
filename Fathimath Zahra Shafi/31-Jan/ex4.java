package practical_exercises;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		String rev="";
		int i;
		System.out.println("enter a string");
		Scanner scanner=new Scanner(System.in);
		str=scanner.nextLine();
		for(i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		
		}
		System.out.print(rev);
		

	}

}
